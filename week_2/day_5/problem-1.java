//Sort character by frequency
class Solution {
    public String frequencySort(String s) {
        char[] ch=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(char c:ch){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Character> ls=new ArrayList<>(map.keySet());
        ls.sort((a,b)->{
            if(map.get(a)!=map.get(b))
            return map.get(b)-map.get(a);
            return Character.compare(a,b);

        });
        StringBuilder ans=new StringBuilder();
        for(char c : ls) {
            int freq = map.get(c);

            while(freq-- > 0) {
                ans.append(c);
            }
        }

        return ans.toString();
    }
}
