class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split("\\s+");
        if(pattern.length() != words.length){
            return false;
        }
        HashMap<Character,String>mp1=new HashMap<>();
        HashMap<String,Character>mp2=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            if(mp1.containsKey(ch)){
                if(!mp1.get(ch).equals(words[i])){
                    return false;
                }
            }
            else{
                mp1.put(ch,words[i]);
            }

            if(mp2.containsKey(words[i])){
                if(mp2.get(words[i])!=ch){
                    return false;
                }
            }
            else{
                mp2.put(words[i],ch);
            }
        }
        return true;
    }
}