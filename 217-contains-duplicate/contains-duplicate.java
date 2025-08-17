class Solution {
    public boolean containsDuplicate(int[] nums) {
        //using set
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if(!set.add(num)){
                return true;
            }
        }

        return false;
    }
}