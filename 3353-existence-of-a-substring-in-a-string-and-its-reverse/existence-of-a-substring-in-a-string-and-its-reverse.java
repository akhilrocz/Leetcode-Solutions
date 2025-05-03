class Solution {
    public boolean isSubstringPresent(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        Set<String> substrings = new HashSet<>();
        for (int j = 0; j < s.length() - 1; j++) {
            substrings.add(s.substring(j, j + 2));
        }

        for (int k = 0; k < rev.length() - 1; k++) {
            if (substrings.contains(rev.substring(k, k + 2))) {
                return true;
            }
        }

        return false;
    }
}