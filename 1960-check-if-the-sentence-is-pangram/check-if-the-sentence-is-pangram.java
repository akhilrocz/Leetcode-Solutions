class Solution {
    public boolean checkIfPangram(String sentence) {
      boolean[] charArr = new boolean[26];

      //boolean found =false;

      for(char c:sentence.toCharArray()){
        if(c>='a' && c<='z'){
            charArr[c-'a']=true;
        }
      }

      for(boolean present:charArr){
        if(!present){
            return false;
        }
      }

      return true;

    }
}