class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            int x = Character.getNumericValue(s.charAt(i));
            sum += x;
            product *= x;
        }

        int res = sum + product;

        return n % res == 0;
    }
}