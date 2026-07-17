class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         //indices  0 1 2 3 4 ...n  
        // [1,2,3,4,....n] //numbers

        List<Integer> result = new ArrayList<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            int index =Math.abs(nums[i])-1;

            if(nums[index]<0){
                result.add(index+1);
            }else{
                nums[index]=-nums[index];
            }
        }

        return result;


    }
}