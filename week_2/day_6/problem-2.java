//weighting word mapping 
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans="";
        int s=0;
        int res;
        for(int i=0;i<words.length;i++){
            String w=words[i];
            s=0;
            res=0;
            for(int j=0;j<w.length();j++){
                int ch=(int)w.charAt(j);
                int v=ch-97;
                s+=weights[v];
            }
            res=s%26;
            char c=(char)(122-res);
            ans+=c;
        }
        return ans;
    }
}
