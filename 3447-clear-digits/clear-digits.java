class Solution {
    public String clearDigits(String s) {
        // Stack
        Stack<Character> stk = new Stack<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                if (!stk.isEmpty() && !Character.isDigit(stk.peek())) {
                    stk.pop();
                }
            } else {
                stk.push(c);
            }
        }

        StringBuilder res = new StringBuilder();
        for (char c : stk) {
            res.append(c);
        }

        return res.toString();
    }
}