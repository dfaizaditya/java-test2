public class biner {

    static void mybiner(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (j % 2 == 1)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        mybiner(5);

    }
}
