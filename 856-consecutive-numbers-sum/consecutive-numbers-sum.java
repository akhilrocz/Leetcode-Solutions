class Solution {
    public int consecutiveNumbersSum(int n) {
       int upperBound = (int) Math.floor(Math.sqrt(2*n));
       int cnt=0;
       for(int m=1;m<=upperBound;m++){
            if((2 * n + m - m * m) % (2 * m)==0)
            {
                cnt++;
            }
       }
       return cnt;
    }
}