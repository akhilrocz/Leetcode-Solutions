class Solution {
    public String finalString(String s) {
      StringBuilder res=new StringBuilder();
      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c!='i'){
            res.append(c);
        }else if(c=='i'){
            res.reverse();
        }
      }
      return res.toString();
    }
}