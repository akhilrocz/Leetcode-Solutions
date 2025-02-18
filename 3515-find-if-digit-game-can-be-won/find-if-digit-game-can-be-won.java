class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum1=0;  //1 digit sum
        int sum2=0;  //2 digit sum

     for(int i=0;i<nums.length;i++){
        String s = String.valueOf(nums[i]);
        if(s.length()==1){
            sum1+=Integer.parseInt(s);
        }
        else if(s.length()==2){
            sum2+=Integer.parseInt(s);
        }


     }

       if(sum1>sum2 || sum2>sum1){
        return true;
       }else{
        return false;
       }

    }
}