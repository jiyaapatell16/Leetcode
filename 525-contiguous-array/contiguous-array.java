class Solution {
    public int findMaxLength(int[] nums) {
        int arr[]=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)sum-=1;
            else sum+=1;
            arr[i]=sum;
        }

        int max=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,-1);
        for(int i=0;i<arr.length;i++){
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i],i);
            }
            else{
                int val=mp.get(arr[i]);
                if(i-val>max)max=i-val;
            }
        }
        return max;
    }
}