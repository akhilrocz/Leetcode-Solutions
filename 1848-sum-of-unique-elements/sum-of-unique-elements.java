class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        Map<Integer,Integer> map =new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                sum+=entry.getKey();
            }
        }
        return sum;
    }
}