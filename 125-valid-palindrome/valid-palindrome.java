class Solution {
    public boolean isPalindrome(String s) {
        String trimmedString = s.replaceAll("[^a-zA-Z0-9]","");
        String loweredcaseStr =trimmedString.toLowerCase();
        String rev ="";
        for(int i=loweredcaseStr.length()-1;i>=0;i--){
            rev+=loweredcaseStr.charAt(i);
        }

        return rev.equals(loweredcaseStr);
    }
}