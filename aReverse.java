import java.util.Arrays;

public class aReverse {
    public static void main(String[] args) {
        int[] arr = { 4, 10, 19, 2, 1, 3 };
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
