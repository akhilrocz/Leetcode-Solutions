class Solution {
    public String finalString(String s) {
      String res="";
      for(int i=0;i<s.length();i++)
      {
        if(s.charAt(i)!='i')
        {
            res+=s.charAt(i);
        }else if(s.charAt(i)=='i'){
            String x="";
            for(int j=res.length()-1;j>=0;j--){
            x+=res.charAt(j);
            }
            res=x;
        }
      }
       return res;
    }
}