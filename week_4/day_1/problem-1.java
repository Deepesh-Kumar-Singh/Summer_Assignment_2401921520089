//Maximum number of balloon
class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();

map.put('b', 0);
map.put('a', 0);
map.put('l', 0);
map.put('o', 0);
map.put('n', 0);
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int min=Integer.MAX_VALUE;
        for(char key:map.keySet()){
            if(key=='b'){
                min=Math.min(min,map.get(key));
            }
            else if(key=='a'){
                min=Math.min(min,map.get(key));
            }
            else if(key=='l'){
                min=Math.min(min,map.get(key)/2);
            }
            else if(key=='o'){
                min=Math.min(min,map.get(key)/2);
            }
            else if(key=='n'){
                min=Math.min(min,map.get(key));
            }

        }
        return min;
    }
}
