class Solution {
    public int earliestTime(int[][] tasks) {
        int min = Integer.MAX_VALUE;
        for(int[] row:tasks){
            int sum=0;
            for(int num:row){
                sum+=num;
            }

            if(sum<min){
                min = sum;
            }

        }

        return min;
    }
}