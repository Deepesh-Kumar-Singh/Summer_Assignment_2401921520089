//Detail -Set Matrix Zeroes
class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<ArrayList<Integer>> zero=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    ArrayList<Integer> z=new ArrayList<>();
                    z.add(i);
                    z.add(j);
                    zero.add(z);
                }
            }
        }
        for(int i=0;i<zero.size();i++){
            ArrayList<Integer> arr=zero.get(i);
            for(int k=0;k<matrix[0].length;k++){
                matrix[arr.get(0)][k]=0;
            }
            for(int h=0;h<matrix.length;h++){
                matrix[h][arr.get(1)]=0;
            }
        }
    }
}
