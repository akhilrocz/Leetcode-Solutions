class Solution {
    public boolean checkGoodInteger(int n) {
        int sum1=0;
        int sum2=0;
        
        int temp1=n;

        while(temp1>0){
            int r=temp1%10;
            sum1+=r;
            temp1/=10;
        }


        int temp2=n;


        while(temp2>0){
            int r=temp2%10;
            sum2+=r*r;
            temp2/=10;
        }

        return sum2 - sum1 >= 50;


    }
}