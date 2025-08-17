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

        int left=0;
        int right = numbers.length-1;
        while(left<right){
            int mid = (left)+(right-left)/2;
            if(numbers[left]+numbers[right]==target){
                return new int[]{left+1,right+1};
            }else if(numbers[left]+numbers[right]<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[0];
    }
}