class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            mp.put(c,mp.getOrDefault(c,0)+1);
        }

        HashMap<Character,Integer> mp1=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char c=magazine.charAt(i);
            mp1.put(c,mp1.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> entry:mp.entrySet()){
            if(entry.getValue()>mp1.getOrDefault(entry.getKey(),0)){
                return false;
            }
        }
        return true;
    }
}