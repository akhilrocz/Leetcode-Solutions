class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int n=nums.length;
        List<Integer> l = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            int count = map.getOrDefault(num,0);
            if(count<k){
                l.add(num);
                map.put(num,map.getOrDefault(num,0)+1);
            }

        }
        int[] res = new int[l.size()];
        for(int i=0;i<l.size();i++){
            res[i]=l.get(i);
        }

        return res;
        
    }
}