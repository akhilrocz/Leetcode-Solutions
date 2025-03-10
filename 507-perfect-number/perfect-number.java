class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num<=1) return false;
        int sum=0;
        int sqrt = (int) Math.sqrt(num);
        for(int i=1;i<=sqrt;i++){
            if(num%i==0){
                sum+=i;
                if(i!=1 && i!=num/i){
                    sum+=num/i;
                }
            }
        }

        return sum==num;
    }
}