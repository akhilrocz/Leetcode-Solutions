class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            int setBits = Integer.bitCount(i);

            if(isPrime(setBits)){
                count++;
            }

        }

        return count;
    }

    private boolean isPrime(int n){
        if(n<2) return false;

        for(int k=2;k<=Math.sqrt(n);k++){
            if(n%k==0) return false;
             
        }

        return true;

    }
}