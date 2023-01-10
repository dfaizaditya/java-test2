import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class logika3 {

    public static HashMap<String, ArrayList<String>> wordMap = new HashMap<String, ArrayList<String>>();

    public static ArrayList<String> wordSegment(Set<String> wordDict, String text) {
        if (wordMap.containsKey(text)) {
            return wordMap.get(text);
        }
        ArrayList<String> result = new ArrayList<String>();

        if (wordDict.contains(text)) {
            result.add(text);
        }

        for (int i = 0; i < text.length(); i++) {
            String prefix = text.substring(0, i + 1);

            if (wordDict.contains(prefix)) {
                String suffix = text.substring(i + 1);
                ArrayList<String> subRes = wordSegment(wordDict, suffix);
                for (String word : subRes) {
                    result.add(prefix + " " + word);
                }
            }
        }

        wordMap.put(text, result);
        return result;
    }

    public static void formatPrint(ArrayList<String> lst){
        if(lst.size() >0){
            System.out.println(lst);
        }else{
            System.out.println("<no way>");
        }
    }

    public static void main(String[] args) {
        Set<String> mDict = new HashSet<>(Arrays
                .asList("pro",
                        "gram",
                        "merit",
                        "program",
                        "it",
                        "programmer"));
        formatPrint(wordSegment(mDict, "program"));
        formatPrint(wordSegment(mDict, "programit"));
        formatPrint(wordSegment(mDict, "programmerit"));
        formatPrint(wordSegment(mDict, "programlala"));
        formatPrint(wordSegment(mDict, "proletarian"));
        

    }
}
