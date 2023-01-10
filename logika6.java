import java.util.Arrays;

public class logika6 {

    public static int kaprekarsConst(int start) {
        int myConst = 0;

        do {
            start = gen2Num(start);
            myConst++;
        } while (start != 6174);

        return myConst;
    }

    static int gen2Num(int n) {

        String myStr = String.valueOf(n);

        char[] myChar = myStr.toCharArray();
        Arrays.sort(myChar);
        myStr = new String(myChar);

        String myStrRev = new StringBuilder(new String(myStr))
                .reverse().toString();

        int n1 = Integer.parseInt(myStr);
        int n2 = Integer.parseInt(myStrRev);

        return Math.max(n1, n2) - Math.min(n1, n2);
    }

    public static void main(String[] args) {
        System.out.println(kaprekarsConst(3124));
    }
}
