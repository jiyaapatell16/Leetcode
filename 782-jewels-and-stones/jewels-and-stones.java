class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        HashSet<Character> mp=new HashSet<>();
        for(int i=0;i<jewels.length();i++){
            mp.add(jewels.charAt(i));
        }
        for(int i=0;i<stones.length();i++){
            if(mp.contains(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }
}