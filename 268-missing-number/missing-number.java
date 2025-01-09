class Solution {
    public int missingNumber(int[] nums) {
       int n = nums.length;
       int actualSum=0;
       int expetedSum=0;
       for(int num:nums){
        actualSum+=num;
       }
       expetedSum=n*(n+1)/2;
       int res = expetedSum-actualSum;
       return res;
        }
    }



// class Solution {
//   public int missingNumber(int[] nums) {
//     int n = nums.length + 1; // Assuming sequence starts from 0 and goes up to n-1 (length of the array + 1 for missing number)
//     // Check if the array is empty
//     if (n == 1) return 0; // If empty, missing number is the first element (0)
//     // Handle cases where all numbers might cancel out
//     for (int i = 0; i < n; i++) {
//       // Check if the current expected number (i) exists in the array
//       if (Arrays.stream(nums).anyMatch(num -> num == i)) {
//         continue; // If found, skip to next expected number
//       } else {
//         return i; // If not found, it's the missing number - return here
//       }
//     }
//   }
// }
