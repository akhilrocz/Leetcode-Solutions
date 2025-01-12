
class Solution {
 public int[] sortedSquares(int[] nums) {
    int[] res=new int[nums.length];
    int left=0;
    int right=nums.length-1;
    for(int x=nums.length-1;x>=0;x--){
        if(nums[left]*nums[left]>nums[right]*nums[right]){
            res[x]=nums[left]*nums[left];
            left++;
        }
        else{
            res[x]=nums[right]*nums[right];
            right--;
        }
    }
    return res;

 }
}