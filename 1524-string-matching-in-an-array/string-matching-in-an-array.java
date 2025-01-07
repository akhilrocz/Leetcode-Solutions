class Solution {
    public List<String> stringMatching(String[] words) {
       Set<String> res = new HashSet<>();
    for(String word1:words){
        for(String word2:words){
            if(!word1.equals(word2) && word2.contains(word1)){
                res.add(word1);
                break;
            }
        }   
    }
     return new ArrayList<>(res);
    }
}