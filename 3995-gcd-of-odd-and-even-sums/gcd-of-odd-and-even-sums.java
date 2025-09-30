class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        int counter1 = n;
        int counter2 = n;
        int i = 1;
        int j = 2;

        while (counter1 > 0) {
            sumOdd += i;
            i += 2;
            counter1--;
        }

        while (counter2 > 0) {
            sumEven += j;
            j += 2;
            counter2--;
        }

        int min = Math.min(sumOdd, sumEven);
        int gcd = 1;

        for (int k = 1; k < min; k++) {
            if (sumOdd % k == 0 && sumEven % k == 0) {
                gcd = k;
            }
        }

        return gcd;

    }
}