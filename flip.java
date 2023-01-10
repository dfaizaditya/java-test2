public class flip {

    public static int getFlipsCount(String target) {
        int count = 0;
        int[] arr = new int[target.length()];
        for (int i = 0; i < target.length(); i++) {
            arr[i] = Integer.valueOf(target.charAt(i) + "");
        }
        for (int i = 0; i < arr.length; i++) {
            int temp = (count % 2) ^ arr[i];
            count += temp;
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(getFlipsCount("01001"));
    }
}
