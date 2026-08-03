class Solution {
    public int numberOfSpecialChars(String word) {
        int[] lowercase = new int[26];
        int[] uppercase = new int[26];

        Arrays.fill(lowercase,-1);

        Arrays.fill(uppercase,-1);

        for(int i=0;i<word.length();i++){
            char c =word.charAt(i);
            if(Character.isLowerCase(c)){
                lowercase[c-'a']=i;  //last occurence
            }else{
                int index =c-'A';
                if(uppercase[index]==-1){
                    uppercase[index]=i;  //first occurence
                }
            }
        }

        int count=0;

        for(int i=0;i<26;i++){
            if(lowercase[i]!=-1 && uppercase[i]!=-1 && lowercase[i]<uppercase[i]){
                count++;
            }
        }

        return count;

    }
}