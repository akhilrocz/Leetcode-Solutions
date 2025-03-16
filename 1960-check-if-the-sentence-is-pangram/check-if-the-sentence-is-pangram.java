class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c >= 'a' && c <= 'z') {
                set.add(c);
            }
        }

        // to check every char appear atleast once
        return set.size() == 26;
    }
}