class Solution {
    public int numberOfSpecialChars(String word) {
        Map<Character,Integer> map = new HashMap<>();

        for(char c:word.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int count=0;

        for(char key:map.keySet()){
            if(Character.isUpperCase(key) && map.containsKey(Character.toLowerCase(key))){
                count++;
            }
        }

        return count;
    }
}