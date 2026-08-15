class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(!mp.containsKey(ch)){
                return false;
            }
            mp.put(ch,mp.getOrDefault(ch,0)-1);
        }
        for(int value:mp.values()){
            if(value!=0)return false;
        }
        return true;
    }
}