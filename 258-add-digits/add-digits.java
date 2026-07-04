class Solution {
    public int addDigits(int num) {

        // Iterative solution
        // while(num>=10){  //11
        //     int sum=0;
        //     while(num>0){
        //         int r=num%10;  //8  //3
        //         sum+=r;  //8 //11  //2
        //         num/=10;//3  //0
        //     }
        //     num=sum;
        // }
        // return num;

        //optimized solution  ==> Digital root concept

        //any number can be represented by multiple of 9

       // Eg: 9*0+1, 9*0+2.... 9*1+1 

       //if number is zero return 0, else return num%9

       return num==0?0:1+(num-1)%9;


    }
}