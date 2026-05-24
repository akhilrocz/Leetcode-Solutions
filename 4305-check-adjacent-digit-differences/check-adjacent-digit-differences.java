class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        // int n = s.length();
        // for (int i = 0; i < n - 1; i++) {
        //     int diff = Math.abs(s.charAt(i + 1) - s.charAt(i));
        //     if (diff > 2) {
        //         return false;
        //     }
        // }
        // return true;

        //2nd approach
        int n =s.length();

        return IntStream.range(0,n-1).allMatch(i->Math.abs(s.charAt(i+1)-s.charAt(i))<=2);
    }
}