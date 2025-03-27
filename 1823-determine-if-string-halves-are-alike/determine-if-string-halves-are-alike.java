import java.util.Set;
import java.util.HashSet;

class Solution {
    public boolean halvesAreAlike(String s) {
        int count1 = 0;
        int count2 = 0;
        Set<Character> vowels = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u'));

        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (vowels.contains(Character.toLowerCase(s.charAt(i)))) {
                if (i < n / 2) {
                    count1++;
                } else {
                    count2++;
                }
            }
        }

        // The original logic incorrectly incremented count2 for non-vowels.
        // We only need to compare the vowel counts of the two halves.
        return count1 == count2;
    }
}