class Solution {
    public int partitionString(String s) {
        Set<Character> set = new HashSet<>();
        int count=1;
        for( char c:s.toCharArray()){
            if(!set.add(c)){
                set.clear();  
                count++;  //1. //2. //3....
                set.add(c); 
            }else{
            set.add(c);
            }
            
        }

        return count;
    }
}