class Solution {
    public double average(int[] salary) {
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        for(int i=0;i<salary.length;i++){
            if(salary[i]>maximum){
                maximum = salary[i];
            }
        }

        for(int j=0;j<salary.length;j++){
            if(salary[j]!=maximum && salary[j]<minimum){
                minimum = salary[j];
            }
        }


        double sum=0;
        double noOfNonMaxandMinElements =0;

        for(int k=0;k<salary.length;k++){
            if(salary[k]!=maximum){
                if(salary[k]!=minimum){
                    noOfNonMaxandMinElements++;
                    sum+=salary[k];
                }
            }
        }

        return sum/noOfNonMaxandMinElements;

    }
}