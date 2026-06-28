class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n =arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        Set<Integer> set = new HashSet<>();

        for(int value:map.values()){
            if(!set.add(value)){
                return false;
            }
        }

        return true;
    }
}