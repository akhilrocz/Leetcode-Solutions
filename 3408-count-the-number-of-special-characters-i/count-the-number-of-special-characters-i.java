class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set = new HashSet<>();

        for(char c:word.toCharArray()){
            set.add(c);
        }

        int count=0;

        for(char c:set){
            if(Character.isLowerCase(c) && set.contains(Character.toUpperCase(c)) ) {
                count++;
            }
        }

        return count;
    }
}