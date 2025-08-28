class Solution {
    public int diagonalSum(int[][] mat) {
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

            for (int i = 0; i < mat.length; i++) {
                mainDiagonalSum += mat[i][i]; //00 11 22
                if (!(mat.length%2==1 && i == mat.length / 2)) {
                  secondaryDiagonalSum += mat[i][mat.length - i - 1]; //02  11  20
                }
            }
        
        return mainDiagonalSum + secondaryDiagonalSum;

    }
}