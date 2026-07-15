class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;

        int i = 1;

        int j = 2;

        while (n-- > 0) {
            sumOdd += i;
            sumEven += j;
            i += 2;
            j += 2;
        }

        int gcd = 1;

        for (int k = 1; k <= sumOdd && k <= sumEven; k++) {
            if (sumOdd % k == 0 && sumEven % k == 0) {
                gcd = k;
            }
        }

        return gcd;

    }
}