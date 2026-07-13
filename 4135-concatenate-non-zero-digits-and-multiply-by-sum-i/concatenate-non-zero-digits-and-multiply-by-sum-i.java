class Solution {
    public long sumAndMultiply(int n) {
        if(n==0) return 0;
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder();

        for(char c:s.toCharArray()){
            if(c!='0'){
                sb.append(c);
            }
        }

        String str = sb.toString();
        long num = Long.parseLong(str);

        long sum=0;
        long temp=num;

        while(temp>0){
            long r = temp%10;
            sum+=r;
            temp/=10;
        }

        return num*sum;

    }
}