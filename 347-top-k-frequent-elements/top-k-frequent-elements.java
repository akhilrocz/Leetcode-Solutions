class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        if (n == 1)
            return new int[] { nums[0] };

        //if go through array TC is 0(n)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1); //put number and index in map 
            // {1,3} {2,2} {3,1}
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list,(a,b)->b.getValue()-a.getValue());

        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i]=list.get(i).getKey();
        }

        return res;
    }
}