class Solution {
    public List<Integer> findMissingElements(int[] nums) {
    //     int min = Integer.MAX_VALUE;
    //     int max = Integer.MIN_VALUE;

    //     for (int num : nums) {
    //         if (num > max) {
    //             max = num;
    //         }

    //         if (num < min) {
    //             min = num;
    //         }
    //     }

    //     List<Integer> list1 = IntStream.rangeClosed(min,max).boxed().collect(Collectors.toList());

    //     List<Integer> list2=Arrays.stream(nums).boxed().collect(Collectors.toList());

    //  List<Integer> missingNums = list1.tostream().filter(element-> !list2.contains(element)).collect(Collectors.toList());

    //  return missingNums;


        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

         Set<Integer> set = new HashSet<>();

          List<Integer> res = new ArrayList<>();

        for (int num : nums) {
            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }


            set.add(num);
        }


        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                res.add(i);
            }
        }

        return res;

    }
}