class Solution {
    public int prefixCount(String[] words, String pref) {
        for(int i=0;i<words.length;i++){
            if(words[i].length()>pref.length()){
               words[i]=words[i].substring(0,pref.length());
            }
        }
        int count=0;
        for(int i=0;i<words.length;i++){
            if(words[i].contains(pref)){
            count++;
            }
        }
        return count>0?count:0;
        
    }
}