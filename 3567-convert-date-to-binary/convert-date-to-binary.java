class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder();
        for (String s : date.split("-")) {
            int x = Integer.parseInt(s);
            String biStr = Integer.toBinaryString(x);
            sb.append(biStr).append("-");
        }
        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}