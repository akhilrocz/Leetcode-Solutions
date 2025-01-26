class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk =new Stack<>();
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!stk.isEmpty() && stk.peek()==s.charAt(i)){
                stk.pop();
            }else{
            stk.push(s.charAt(i));
            }
        }
        for(char c:stk){
            sb.append(c);
        }
    
    return sb.toString();

    }
}