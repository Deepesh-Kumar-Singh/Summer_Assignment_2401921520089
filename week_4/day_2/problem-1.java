//Maximum Manhattan Distance After All Moves
class Solution {
    public int maxDistance(String moves) {
        int[]dis=new int[2];
        dis[0]=0;
        dis[1]=0;
        int u=0;
        for(int i=0;i<moves.length();i++){
            char v=moves.charAt(i);
            if(v=='U'){
                dis[1]+=1;
            }
            else if(v=='D'){
                dis[1]-=1;
            }
            else if(v=='L'){
                dis[0]-=1;
            }
            else if(v=='R'){
                dis[0]+=1;
            }
            else{
                u++;
            }
        }
        return Math.abs(dis[0])+Math.abs(dis[1])+u;
    }
}
