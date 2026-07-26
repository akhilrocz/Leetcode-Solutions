class Solution {
    public String processStr(String s) {
       StringBuilder sb = new StringBuilder();
       int n =s.length();
       for(int i=0;i<n;i++){
        char c=s.charAt(i);
        if(c!='*' && c!='#' && c!='%'){
            sb.append(c);
        }else if(c=='#'){
            sb.append(sb.toString());
        }else if(c=='%'){
            sb.reverse();
        }
       else if(sb.length()>0 && c=='*'){
            sb.deleteCharAt(sb.length()-1);
        }
       }

       String result =sb.toString();

       return result;
    }
}