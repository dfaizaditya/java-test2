import java.util.Arrays;

public class merge {

    static int[] myMerge(int[] arr, int[] arr2) {

        int[] merged = new int[arr.length + arr2.length];

        int fooPos, barPos, mergePos;
        fooPos = barPos = mergePos = 0;

        while (fooPos < arr.length && barPos < arr2.length) {
            if (arr[fooPos] < arr2[barPos]) {
                merged[mergePos++] = arr[fooPos++];
            } else {
                merged[mergePos++] = arr2[barPos++];
            }
        }

        while (fooPos < arr.length) {
            merged[mergePos++] = arr[fooPos++];
        }
        while (barPos < arr2.length) {
            merged[mergePos++] = arr2[barPos++];
        }

        return merged;

    }

    public static void main(String[] args) {
        int[] foo = { 1, 2, 3, 8};
        int[] bar = { 4, 6, 7, 8 };
        System.out.println(Arrays.toString(myMerge(foo, bar)));

    }
}
