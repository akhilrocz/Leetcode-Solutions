class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 1) {
            sb.append("a".repeat(n));
        }

        else {
            sb.append("a".repeat(n - 1));
            sb.append("b");
        }

        return sb.toString();
    }
}