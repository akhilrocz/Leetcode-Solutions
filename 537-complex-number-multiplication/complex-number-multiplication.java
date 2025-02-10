class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String[] str1 = num1.split("\\+|i");
        String[] str2 = num2.split("\\+|i");

        int real_part1 = Integer.parseInt(str1[0]);
        int imaginary_part1 = Integer.parseInt(str1[1]);

        int real_part2 = Integer.parseInt(str2[0]);
        int imaginary_part2 = Integer.parseInt(str2[1]);

        return (real_part1 * real_part2 - imaginary_part1 * imaginary_part2) + "+"
                + (real_part1 * imaginary_part2 + real_part2 * imaginary_part1) + "i";
    }
}