public class logika5 {

    static int maxPro;

    static void profit(int[] lst){
        maxPro = 0;
        for(int i=0; i<lst.length; i++){
            for(int j=i+1; j<lst.length; j++){ 
                if(lst[j] > lst[i]){
                    if(lst[j]-lst[i] > maxPro){
                        maxPro = lst[j]-lst[i];
                    }
                }
            }
        }
    }

    static void formatPrint(int[] arr){
        profit(arr);
        if(maxPro >0){
            System.out.println(maxPro);
        }else{
            System.out.println("Harga selalu turun");
        }
        
    }
    
    public static void main(String[] args) {
        int[] arr = {5,6,15,3,10,22,15};
        int[] arr2 = {10,15,8,7,14};
        int[] arr3 = {100,90,80,75,65};
        formatPrint(arr);
        formatPrint(arr2);
        formatPrint(arr3);
    }
}
