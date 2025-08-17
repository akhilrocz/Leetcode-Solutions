class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //brute force
        // for(int i=0;i<numbers.length-1;i++){
        //     for(int j=i+1;j<numbers.length;j++){
        //         if(numbers[i]+numbers[j]==target){
        //             return new int[]{i+1,j+1};
        //         }
        //     }
        // }

        // return null;

        //optimized

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int complement = target-numbers[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement)+1,i+1};
            }

            map.put(numbers[i],i);
        }

        return null;
    }
}