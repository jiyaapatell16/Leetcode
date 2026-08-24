class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        HashSet<Integer> mp=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            mp.add(nums[i]);
        }
        for(int num:mp){
            int count=1;
            int current=num;
            if(!mp.contains(current-1)){
                while(mp.contains(current+1)){
                count++;
                current++;
                }
                if(count>max)max=count;
            }
        }
        return max;
    }
}