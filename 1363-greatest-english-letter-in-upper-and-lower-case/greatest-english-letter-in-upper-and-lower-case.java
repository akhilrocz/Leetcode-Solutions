class Solution {
    public String greatestLetter(String s) {
        
        boolean[] lowercase = new boolean[26];

        boolean[] uppercase = new boolean[26];

        for(char c:s.toCharArray()){ //0(n) TC
            if(Character.isLowerCase(c)){
                lowercase[c-'a']=true;
            }else{
                uppercase[c-'A']=true;
            }
        }

        for(int i=25;i>=0;i--){
            if(lowercase[i] && uppercase[i]){
                return String.valueOf((char) ('A'+i));  //65 +25=90 represents Z
            }
        }

        return "";

    }
}