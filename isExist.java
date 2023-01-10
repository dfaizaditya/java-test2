public class isExist {

    static boolean myEx(String[] lst, String str){
        for (String s : lst) {
            if (str.equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] arr = { "paul", "smith", "peter"};
        System.out.println(myEx(arr, "john"));
        System.out.println(myEx(arr, "smith"));
        
    }
}
