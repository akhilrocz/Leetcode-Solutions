class Solution {
    public String greatestLetter(String s) {
        Set<Character> set = new HashSet<>();
        for(char c:s.toCharArray()){
            set.add(c);
        }

        int max =0;

        for(char c:set){
            if(Character.isLowerCase(c) && set.contains(Character.toUpperCase(c))) {
                max = Math.max(max, (int)c);
            }
        }

        if(max==0){
            return "";
        }

        String result = Character.toString(Character.toUpperCase((char) max));

        return result;

    }
}