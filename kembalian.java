import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class kembalian {

    static void kembalian(Integer[] lst){
        Arrays.sort(lst,  Collections.reverseOrder());
        System.out.println(Arrays.toString(lst));
        Integer num = 32000;
        ArrayList<Integer> aList =  new ArrayList<Integer>();
        for(Integer i : lst) {
            if(num !=0){
                while(i <= num){
                    aList.add(i);
                    num = num - i;
                }
            }
        }
        System.out.println(aList);

    }
    public static void main(String[] args) {
        Integer[] someArray = new Integer[] { 5000, 2000, 10000, 20000};
        kembalian(someArray);
    }
}
