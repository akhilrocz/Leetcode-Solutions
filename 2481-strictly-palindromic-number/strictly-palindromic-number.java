class Solution {
    public boolean isStrictlyPalindromic(int n) {
        boolean flag = true;
        for (int i = 2; i <= n - 2; i++) {
            StringBuilder sb = new StringBuilder();
            String s = Integer.toString(n,i);
            for (int j = s.length() - 1; j >= 0; j--) {
                sb.append(s.charAt(j));
            }
            if (!sb.toString().equals(s)) {
                flag = false;
                break;
            }
        }

       return flag;
    }
}