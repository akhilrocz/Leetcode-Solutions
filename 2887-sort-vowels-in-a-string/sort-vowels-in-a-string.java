class Solution {
    public String sortVowels(String s) {
        StringBuilder sb = new StringBuilder();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                list.add(ch);
            }
        }

        Collections.sort(list);

        int index = 0;
        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                sb.append(list.get(index));
                index++;
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}