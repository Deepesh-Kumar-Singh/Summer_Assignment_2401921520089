//Maximize Sum of Device Ratings
class Solution {
    public long maxRatings(int[][] units) {
        long ans = 0;

        boolean allOne = true;
        for (int[] device : units) {
            if (device.length > 1) {
                allOne = false;
                break;
            }
        }

        if (allOne) {
            for (int[] device : units) {
                ans += device[0];
            }
            return ans;
        }

        long sumSecond = 0;
        int minFirst = Integer.MAX_VALUE;
        int minSecond = Integer.MAX_VALUE;

        for (int[] device : units) {
            int first = Integer.MAX_VALUE;
            int second = Integer.MAX_VALUE;

            for (int x : device) {
                if (x < first) {
                    second = first;
                    first = x;
                } else if (x < second) {
                    second = x;
                }
            }

            minFirst = Math.min(minFirst, first);

            if (device.length == 1) {
                second = first;
            }

            sumSecond += second;
            minSecond = Math.min(minSecond, second);
        }

        return sumSecond - minSecond + minFirst;
    }
}
