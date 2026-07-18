class Solution {
    public int findGCD(int[] nums) {
        int smallestNumber =1000;
        int largestNumber =1;

        for(int num:nums){
            if(num<smallestNumber){
                smallestNumber =num;
            }


            if(num>largestNumber){
                largestNumber=num;
            }
        }

        int gcd=1;

        //2
        //2 3 4 5 6 7 8 9 10

        for(int i=1;i<=smallestNumber && i<=largestNumber;i++){
            if(smallestNumber%i==0 && largestNumber%i==0){
                gcd=i;
            }
        }

        return gcd;
    }
}