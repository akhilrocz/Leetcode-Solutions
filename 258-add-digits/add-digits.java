class Solution {
    public int addDigits(int num) {

        while(num>=10){  //11
            int sum=0;
            while(num>0){
                int r=num%10;  //8  //3
                sum+=r;  //8 //11  //2
                num/=10;//3  //0
            }
            num=sum;
        }
        return num;

    }
}