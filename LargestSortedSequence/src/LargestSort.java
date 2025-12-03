public class LargestSort {

    private int[] array1 = {3,8,10,1,9,14,-3,0,14,207,56,98,12};
     private int storeLongestCount = 1;
     private int currentCount = 1;

    public int longestSortedSequence() {
        if (array1.length == 0)
            return 0;
        if (array1.length == 1)
            return 1;

       for (int i = 1 ; i < array1.length; i++) {
         if(array1[i] >= array1[i - 1]) {
             currentCount++;
         } else {
             if (currentCount > storeLongestCount) {
                 storeLongestCount = currentCount;
             }
             currentCount = 1;
         }
       }
       IO.println(storeLongestCount);
       return storeLongestCount;

    }
}
