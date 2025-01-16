class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> hashMap =new HashMap<>();
        for(int num:nums){
            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
        }
        for(int key:hashMap.keySet()){
            if(hashMap.get(key)>=2){
                return true;
            }
        }
        return false;
    }
}