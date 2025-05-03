class Solution {
    public boolean isSubstringPresent(String s) {
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }

        for(int j=0;j<s.length()-1;j++){
            for(int k=0;k<rev.length()-1;k++){
                 if(s.substring(j,j+2).equals(rev.substring(k,k+2))){
                    return true;
                 }
            }
        }

        return false;
    }
}