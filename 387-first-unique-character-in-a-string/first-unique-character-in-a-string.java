class Solution {
    public int firstUniqChar(String s) {
         int n =s.length();

        //  Map<Character,Integer> map = new HashMap<>();

        //  for(char c:s.toCharArray()){
        //     map.put(c,map.getOrDefault(c,0)+1);
        //  }

        //  for(int i=0;i<n;i++){
        //     char c= s.charAt(i);
        //     if(map.get(c)==1){
        //         return i;
        //     }
        //  }

        //  return -1;

        int[] frequency = new int[26];
        for(int i=0;i<s.length();i++){
            frequency[s.charAt(i)-'a']++;
        }

        int n1 =frequency.length;

        for(int j=0;j<s.length();j++){
            if(frequency[s.charAt(j)-'a']==1){
                return j;
            }
        }

        return -1;


    }
}