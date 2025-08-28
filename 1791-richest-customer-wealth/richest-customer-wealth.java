class Solution {
    public int maximumWealth(int[][] accounts) {
        List<Integer> res = new ArrayList<>();
        
       
       for(int[] row:accounts){
        int sum=0;
        for(int element:row){
            sum+=element;
        }
            res.add(sum);
       }

   


        int max = Integer.MIN_VALUE;

        for(int num:res)
        {
            if(num>max){
                max=num;
            }
        }

        return max;


    }
}