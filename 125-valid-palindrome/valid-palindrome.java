class Solution {
    public boolean isPalindrome(String s) {
       if(s==" ") return true;
       String trimmedStr =s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

       int left=0;
       int right =trimmedStr.length()-1;

       //racecar

       //abla

       while(left<=right){
        if(trimmedStr.charAt(left)!=trimmedStr.charAt(right)){
           return false;
        }

        left++;
        right--;
       }

       return true;
    }
}