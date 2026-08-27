class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int m=t.length();
        int count=m; 
        int sIdx=-1;
        int minLen=n+1;
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(int i=0,j=0;j<=n-1;j++){
            char ch=s.charAt(j);
            mp.put(ch,mp.getOrDefault(ch,0)-1);
            if(mp.get(ch)>=0){
                count--;
            }

            while(i<=j && count==0){
                if(j-i+1<minLen){
                    minLen=j-i+1;
                    sIdx=i;
                }
                mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
                if(mp.get(s.charAt(i))>0)count++;
                i++;
            }
        }
        if(sIdx==-1)return "";
        return s.substring(sIdx,sIdx+minLen);
    }
}