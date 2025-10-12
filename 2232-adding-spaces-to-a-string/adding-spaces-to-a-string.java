class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int m = spaces.length;

        int index = 0;
        for (int i = 0; i < n; i++) {
            if (index<m && spaces[index] == i) {  // 0 != 8..... 8 == 8  
                sb.append(' ');
                index++;
            }

                sb.append(s.charAt(i));
            
        }

        return sb.toString();
    }
}