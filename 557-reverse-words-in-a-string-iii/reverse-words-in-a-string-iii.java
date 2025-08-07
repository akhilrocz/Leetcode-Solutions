class Solution {
    public String reverseWords(String s) {
        String[] strArr = s.split(" "); //array of words
        StringBuilder result = new StringBuilder();

        for (int x=0;x<strArr.length;x++) {
            String st =strArr[x];
            for (int i = st.length() - 1; i >= 0; i--) {
                result.append(st.charAt(i));
            }

            if (x<strArr.length - 1) {
                result.append(" ");
            }

        }

        return result.toString();

    }
}