class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> mp=new HashSet<>();
        int max=0;
        int left=0;
        int right=0;
        while(right<s.length()){
            char ch=s.charAt(right);
            while(mp.contains(ch)){
                mp.remove(s.charAt(left));
                left++;
            }
            mp.add(ch);
            right++;
            if(right-left>max)max=right-left;
        }
        return max;
    }
}