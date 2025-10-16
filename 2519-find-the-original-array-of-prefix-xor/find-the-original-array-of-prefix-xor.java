class Solution {
    public int[] findArray(int[] pref) {
        int n = pref.length;
        if(n==1){
            return pref;
        }

        int[] arr = new int[n];

        //Approach
        // a xor b =c
        // xor on both sides
        // 0 xor b = a^c
        // b = a^c

        arr[0] = pref[0];
        for(int i=1;i<n;i++){
            arr[i] = pref[i-1]^pref[i];
        }

        return arr;


    }
}