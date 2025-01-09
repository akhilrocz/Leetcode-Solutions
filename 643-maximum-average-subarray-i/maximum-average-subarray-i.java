class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        if(n<k){
           return -1;
        }
        double max_avg =0;
        int max_sum=0;
        for(int i=0;i<k;i++){
              max_sum+=nums[i];
        }
              int window_sum = max_sum;
              for(int i=k;i<n;i++){
                window_sum+=nums[i]-nums[i-k];
                max_sum = Math.max(max_sum,window_sum);
              }
              max_avg = (double) max_sum/k;         
        
        return max_avg;
    }
}