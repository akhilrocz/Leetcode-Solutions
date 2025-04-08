class Solution {
    public double average(int[] salary) {
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        double sum = 0;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > maximum) {
                maximum = salary[i];
            }
            if(salary[i]<minimum){
                minimum = salary[i];
            }
            sum+=salary[i];
        }

 
     return (sum-minimum-maximum)/(salary.length-2);
    }
}