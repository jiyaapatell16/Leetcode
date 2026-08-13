class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            mp.put(nums1[i],mp.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            if(mp.containsKey(nums2[i])){
                ans.add(nums2[i]);
                mp.remove(nums2[i]);
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();

    }
}