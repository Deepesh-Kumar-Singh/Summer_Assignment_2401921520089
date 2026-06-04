// Detail -Total Waviness of Numbers in Range
class Solution {
    public int totalWaviness(int num1, int num2) {
        int c=0;
        for(int i=num1;i<=num2;i++){
            ArrayList<Integer> arr=new ArrayList<>();
            int k=i;
            while(k>0){
                arr.add(k%10);
                k/=10;
            }
            if(arr.size()<=2){
                continue;
            }
            else{
                for(int j=1;j<arr.size()-1;j++){
                    if(arr.get(j)>arr.get(j+1)&&arr.get(j)>arr.get(j-1)){
                        c++;
                    }
                    if(arr.get(j)<arr.get(j+1)&&arr.get(j)<arr.get(j-1)){
                        c++;
                    }

                }
            }
        }
        return c;
    }
}
