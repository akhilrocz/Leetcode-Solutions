class Solution {
    public double trimMean(int[] arr) {
        int n = arr.length;

        int k = n / 20;

        Arrays.sort(arr);

        int sum = 0;
        for (int i = k; i < n - k; i++) {
            sum += arr[i];
        }

        return (double) sum / (n - 2 * k);
    }
}