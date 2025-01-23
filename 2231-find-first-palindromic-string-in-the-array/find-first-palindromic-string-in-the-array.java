class Solution {
    public String firstPalindrome(String[] words) {    
      for(String word:words){
        StringBuilder s=new StringBuilder();
        s.append(word);
        s.reverse();
        if(word.equals(s.toString())){
            return word;
        }
      }
      return "";
    }
}