class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0 || strs == null)
            return "";

        String referenceStr = strs[0];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < referenceStr.length(); i++) {
            char c = referenceStr.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return referenceStr.substring(0, i);
                }
            }
        }

        return referenceStr;
    }
}