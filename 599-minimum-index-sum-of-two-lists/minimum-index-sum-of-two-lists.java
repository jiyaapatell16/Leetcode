class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> ans=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        HashMap<String,Integer>mp1=new HashMap<>();
        for(int i=0;i<list1.length;i++){
            mp1.put(list1[i],i);
        }
        HashMap<String,Integer>mp2=new HashMap<>();
        for(int i=0;i<list2.length;i++){
            if(mp1.containsKey(list2[i])){
                int value=mp1.get(list2[i])+i;
                if(value<min)min=value;
                mp2.put(list2[i],value);
            }
        }
        for(Map.Entry<String,Integer>entry : mp2.entrySet()){
            if(entry.getValue()==min){
                ans.add(entry.getKey());
            }
        }
        return ans.toArray(new String[0]);
    }
}