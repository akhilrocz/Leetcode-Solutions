import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger i = new BigInteger(a, 2);
        BigInteger j = new BigInteger(b, 2);
        BigInteger k = i.add(j);
        String binaryStr = k.toString(2);
        return binaryStr;
    }
}