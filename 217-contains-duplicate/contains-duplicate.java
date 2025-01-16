class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> hashMap =new HashMap<>();
        for(int num:nums){
           if(hashMap.containsKey(num)){
            return true;
           }
           hashMap.put(num,1);
        }
        return false;
       
    }
}