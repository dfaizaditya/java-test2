public class logika4 {

    static int largestPalindrome;

    static boolean isPalindrome(int number) {
        boolean result = false;
        int reverseNumber = reverseNumber(number);
        if (number == reverseNumber) {
            result = true;
        }
        return result;
    }

    static int reverseNumber(int number) {
        String reverse = new StringBuilder(Integer.toString(number)).reverse().toString();
        return Integer.parseInt(reverse);
    }

    public static void defineLargestPalindrome(int palindrome) {
        if (palindrome > largestPalindrome) {
            largestPalindrome = palindrome;
        }
    }

    static int laPalindrome(int n) {
        int upper_limit = (int) Math.pow(10, n) - 1;
        int lower_limit = 1 + upper_limit / 10;

        for (int i = upper_limit; i >= lower_limit; i--) {
            for (int k = upper_limit; k >= i; k--) {
                int product = i * k;
                if (isPalindrome(product)) {
                    defineLargestPalindrome(product);
                }
            }
        }
        return largestPalindrome;
    }

    static void formatPrint(int n){
        System.out.println(laPalindrome(n));
    }

    public static void main(String[] args) {
        formatPrint(1);
        formatPrint(2);
        formatPrint(3);
        formatPrint(4);
    }
}
