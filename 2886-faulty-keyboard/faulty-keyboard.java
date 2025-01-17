class Solution {
    public String finalString(String s) {
      StringBuilder res=new StringBuilder();
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)!='i'){
            res.append(s.charAt(i));
        }else if(s.charAt(i)=='i'){
            res.reverse();
        }
      }
      return res.toString();
    }
}