class Solution {
    public String removeStars(String s) {
        
        Deque<Character> stack = new ArrayDeque<>();

        for(char c:s.toCharArray()){
            if(!stack.isEmpty() && c=='*'){
                stack.pop();
            }else{
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(char ch:stack){
            sb.append(ch);
        }

        String re =sb.reverse().toString();

        return re;
        

    }
}