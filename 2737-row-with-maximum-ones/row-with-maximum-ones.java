class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        for (int[] row : mat) {
            int maxOnesRow = 0;
            for (int i = 0; i < row.length; i++) {
                if (row[i] == 1) {
                    maxOnesRow++;
                }
            }
            list.add(maxOnesRow);
        }
        int row = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
                row = i;
            }
        }

        return new int[] { row, max };

    }
}