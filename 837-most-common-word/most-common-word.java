class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        //convert to lower and remove punctuation and convert stringarray
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-z ]", " ");
        String[] words = paragraph.split("\\s+"); 

        //count each word frequency
        HashMap<String,Integer> mp=new HashMap<>();
        for(int i=0;i<words.length;i++){
            mp.put(words[i],mp.getOrDefault(words[i],0)+1);
        }

        //find word while ignoring banned words
        int max=0;
        String ans="";
        for(Map.Entry<String,Integer> entry : mp.entrySet()){
            boolean check=false;
            for(String s: banned){
                if(entry.getKey().equals(s)){
                    check=true;
                    break;
                }
            }
            if(check==true)continue;
            if(entry.getValue()>max){
                ans=entry.getKey();
                max=entry.getValue();
            }
        }
        return ans;
    }
}