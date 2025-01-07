import java.util.*;
class Solution {
    public List<String> stringMatching(String[] words) {
       Set<String> res = new HashSet<>();
       Arrays.sort(words,Comparator.comparingInt(String::length));  //sort array by length
    for(int i=0;i<words.length;i++){
        for(int j=i+1;j<words.length;j++){
            if(words[j].contains(words[i])){
                res.add(words[i]);
                break;
            }
        }
    }
     return new ArrayList<>(res);
    }
}