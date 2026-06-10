// Detail -Maximum Total Subarray Value II
import java.util.*;

class Solution {
    private int[][] maxST;
    private int[][] minST;
    private int[] log;

    public long  maxTotalValue(int[] nums, int k) {
        int n = nums.length;

        // Precompute logs
        log = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            log[i] = log[i / 2] + 1;
        }

        int m = log[n] + 1;

        maxST = new int[m][n];
        minST = new int[m][n];

        for (int i = 0; i < n; i++) {
            maxST[0][i] = nums[i];
            minST[0][i] = nums[i];
        }

        // Build sparse tables
        for (int j = 1; j < m; j++) {
            int len = 1 << j;
            int half = len >> 1;

            for (int i = 0; i + len <= n; i++) {
                maxST[j][i] = Math.max(
                    maxST[j - 1][i],
                    maxST[j - 1][i + half]
                );

                minST[j][i] = Math.min(
                    minST[j - 1][i],
                    minST[j - 1][i + half]
                );
            }
        }

        PriorityQueue<Node> pq =
            new PriorityQueue<>((a, b) -> Long.compare(b.value, a.value));

        for (int l = 0; l < n; l++) {
            pq.offer(new Node(getValue(l, n - 1), l, n - 1));
        }

        long ans = 0;

        while (k-- > 0) {
            Node cur = pq.poll();

            ans += cur.value;

            if (cur.r > cur.l) {
                pq.offer(new Node(
                    getValue(cur.l, cur.r - 1),
                    cur.l,
                    cur.r - 1
                ));
            }
        }

        return ans;
    }

    private long getValue(int l, int r) {
        int len = r - l + 1;
        int p = log[len];

        int mx = Math.max(
            maxST[p][l],
            maxST[p][r - (1 << p) + 1]
        );

        int mn = Math.min(
            minST[p][l],
            minST[p][r - (1 << p) + 1]
        );

        return (long) mx - mn;
    }

    static class Node {
        long value;
        int l;
        int r;

        Node(long value, int l, int r) {
            this.value = value;
            this.l = l;
            this.r = r;
        }
    }
}
