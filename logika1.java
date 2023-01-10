import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
    Asumsi :
    - setiap angka pada array tidak sama (tidak ada duplikat)
    - 
* */

public class logika1 {
    static Integer[] perfectTwo(Integer[] myarray, Integer num) {
        Map<Integer, Integer> dict = new HashMap<Integer, Integer>();
        for (int i = 0; i < myarray.length; i++) {
            dict.put(myarray[i], i);
        }
        Integer[] fin = new Integer[] {};
        for (int i : myMax(myarray, num)) {
            Integer a = dict.get(num - i);
            Integer b = dict.get(i);
            if (a != null && b != null) {
                fin = new Integer[] { a, b };
                return fin;
            }
        }
        return fin;
    }

    static Integer[] myMax(Integer[] myarray, Integer n) {
        Integer[] array = Arrays.stream(myarray).filter(x -> x < n).toArray(Integer[]::new);
        Collections.reverse(Arrays.asList(array));
        return array;
    }

    static void formatPrint(Integer[] myarray, Integer num) {
        Integer[] result = perfectTwo(myarray, num);
        if (result.length > 0) {
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println("<no way>");
        }
    }

    public static void main(String[] args) {
        Integer[] someArray = new Integer[] { 2, 7, 11, 15 };
        formatPrint(someArray, 9);
        formatPrint(someArray, 22);
        formatPrint(someArray, 13);
        formatPrint(someArray, 11);
        formatPrint(someArray, 19);
    }
}
