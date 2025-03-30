import java.util.Map;

class Solution {
    public int reverseDegree(String s) {
        Map<Character, Integer> map = Map.ofEntries(
                Map.entry('a', 26), Map.entry('b', 25), Map.entry('c', 24), Map.entry('d', 23),
                Map.entry('e', 22), Map.entry('f', 21), Map.entry('g', 20), Map.entry('h', 19),
                Map.entry('i', 18), Map.entry('j', 17), Map.entry('k', 16), Map.entry('l', 15),
                Map.entry('m', 14), Map.entry('n', 13), Map.entry('o', 12), Map.entry('p', 11),
                Map.entry('q', 10), Map.entry('r', 9), Map.entry('s', 8), Map.entry('t', 7),
                Map.entry('u', 6), Map.entry('v', 5), Map.entry('w', 4), Map.entry('x', 3),
                Map.entry('y', 2), Map.entry('z', 1));

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int val = map.get(ch);
            sum += (i + 1) * val;
        }

        return sum;
    }
}
