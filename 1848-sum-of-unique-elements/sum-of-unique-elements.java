class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
            if(entry.getValue()==1){
                sum+=entry.getKey();
            }
        }
        return sum;
    }
}