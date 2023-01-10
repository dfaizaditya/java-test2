public class cool {

    static void mycool(int n) {
        if (n <= 0) {
            System.out.println("Please enter a number above 0");
        } else if (n >= 10) {
            System.out.println("Please enter a number below 10");
        } else {
            if (n % 2 == 1) {
                System.out.println("cool");
            } else {
                if (n < 6) {
                    System.out.println("not cool");
                } else {
                    System.out.println("cool");
                }
            }
        }
    }

    public static void main(String[] args) {
        mycool(5);
        mycool(4);
        mycool(8);
    }

}
