class Solution {
    public int missingInteger(int[] nums) {
        int n =nums.length;

        HashSet<Integer> set = new HashSet<>();

        int totalSum=nums[0];

        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]+1){
                totalSum+=nums[i];
            }else{
                break;
            }
        }

        for(int j=0;j<n;j++){
            set.add(nums[j]);
        }

        while(set.contains(totalSum)){
            totalSum+=1;
        }

        return totalSum;

    }
}