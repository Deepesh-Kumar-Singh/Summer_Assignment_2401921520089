// Detail-Partition Array According to given pivot
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> left=new ArrayList<>();
        ArrayList<Integer> right=new ArrayList<>();
        ArrayList<Integer> bitw=new ArrayList<>();
        for(int i:nums){
            if(i<pivot){
                left.add(i);
            }
            else if(i>pivot){
                right.add(i);
            }
            else{
                bitw.add(i);
            }
        }
        int[] ans=new int[nums.length];
        ArrayList<Integer> ansl=new ArrayList<>();
        ansl.addAll(left);
        ansl.addAll(bitw);
        ansl.addAll(right);
        for(int i=0;i<nums.length;i++){
           ans[i]=ansl.get(i);
        }
        return ans;
    }
}
