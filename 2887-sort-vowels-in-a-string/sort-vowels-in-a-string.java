class Solution {
    public String sortVowels(String s) {
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int ascii  = s.charAt(i);
            if("aeiouAEIOU".indexOf(s.charAt(i))!=-1 ){
                list.add(ascii);
            }
        }

    Collections.sort(list);

int index=0;
for(int j = 0;j<s.length();j++){
        if ("aeiouAEIOU".indexOf(s.charAt(j)) != -1){
            sb.append((char) (int) list.get(index++));
        }else{
            sb.append(s.charAt(j));
        }
    }

    return sb.toString();
}
}