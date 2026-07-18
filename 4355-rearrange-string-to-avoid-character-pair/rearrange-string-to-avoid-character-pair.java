class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder sb = new StringBuilder();
        int xCount=0;
        int yCount=0;
       for(char c:s.toCharArray()){
        if(c==x){
            xCount++;
        }else if(c==y){
            yCount++;
        }else{
        sb.append(c);
        }
       }

       for(int i=0;i<yCount;i++){
        sb.append(y);
       }

        for(int j=0;j<xCount;j++){
        sb.append(x);
       }

       return sb.toString();


    }
}