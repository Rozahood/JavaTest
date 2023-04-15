package Level2;

import java.util.Arrays;

public class No2 {
    public static <let> void main(String[] args) {

        int[] arr1 = {1,3,4,5};
        int[] arr2 = {2,6,7,8};
        int[] mergedArr = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, mergedArr, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArr, arr1.length, arr2.length);

        Arrays.sort(mergedArr);

        System.out.println(Arrays.toString(mergedArr));
    }
}
