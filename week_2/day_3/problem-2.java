//Detail-Isomorphic Strings
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char ch2=t.charAt(i);
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(j)==ch || t.charAt(j)==ch2){
                    if(t.charAt(j)!=ch2){
                        return false;
                    }
                    if(s.charAt(j)!=ch){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
