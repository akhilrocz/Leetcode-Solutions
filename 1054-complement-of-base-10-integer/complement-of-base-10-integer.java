class Solution {
    public int bitwiseComplement(int n) {
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='1'){
                sb.append('0');
            }else{
                sb.append('1');
            }
        }

        int num = Integer.parseInt(sb.toString(),2);

        return num;

    }
}