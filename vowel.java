public class vowel {

    static int myVowel(String str){
        int vCount = 0;
        str = str.toLowerCase();  
        for(int i = 0; i < str.length(); i++) {  
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {  
                vCount++;  
            }  

        }
        return vCount;
    }

    
    public static void main(String[] args) {
        System.out.println(myVowel("football"));
        System.out.println(myVowel("scoring goal’"));
        
    }
}
