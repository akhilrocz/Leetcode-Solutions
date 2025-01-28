class Solution {
    public int lengthOfLongestSubstring(String s) {
        //sliding window
        int left=0;
        int right=0;
        int length=0;
        Set<Character> set =new HashSet<>();
        while(right<s.length()){
            if(!set.contains(s.charAt(right)))
            {
                set.add(s.charAt(right));
                right++;
                length=Math.max(length,set.size());
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }

        return length;
    }
}