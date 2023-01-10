import java.util.HashSet;

public class performance3 {
    static int max_xor(int[] nums) {
        int result = 0;
        int mask = 0;
        for (int i = 31; i >= 0; i--) {
            mask += (1 << i);
            final HashSet<Integer> set = new HashSet<>();
            for (int n : nums) {
                set.add(n & mask);
            }
            int temp = result | (1 << i);
            for (int it : set) {
                if (set.contains(it ^ temp)) {
                    result = temp;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 5, 7};

        System.out.println(max_xor(arr));

    }
}
