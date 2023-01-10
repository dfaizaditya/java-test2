import java.util.*;

/*
    Asumsi :
    - jika string tujuan tidak ada di dict maka dianggap <no way>
    - 
* */
public class logika2 {

    private static boolean isOneDiff(String A, String B) {
        if (A.length() != B.length())
            return false;
        int diff = 0;
        char[] arr = A.toCharArray();
        char[] arr2 = B.toCharArray();
        for (int i = 0; i < A.length(); i++) {
            if (arr[i] != arr2[i])
                diff = diff + 1;
            if (diff > 1)
                return false;
        }
        if (diff == 1)
            return true;
        else
            return false;
    }

    private static void hotDog(Set<String> words, String startWord, String endWord) {
        List<String> myDict = new ArrayList<String>(words);

        if (myDict != null) {
            Deque<String> poss = new ArrayDeque<>(myDict);
            Deque<String> fnode = new ArrayDeque<String>();

            fnode.add(startWord);
            Deque<Deque<String>> queue = new ArrayDeque<>();
            queue.add(fnode);

            while (!queue.isEmpty()) {
                Deque<String> curr = queue.poll();
                for (Iterator<String> i = poss.iterator(); i.hasNext();) {
                    String str = i.next();
                    if (!isOneDiff(str, curr.getLast()))
                        continue;
                    if (endWord.equals(str)) {
                        curr.add(endWord);
                        System.out.println(String.join(" ", curr));
                        return;
                    }
                    Deque<String> temp = new ArrayDeque<>(curr);
                    temp.add(str);
                    queue.add(temp);
                    i.remove();
                }
            }
        }
        System.out.println("<no way>");
    }

    public static void main(String[] args) {
        Set<String> dict_Set = new HashSet<>(Arrays.asList("hot", "dot", "dog", "lot", "log"));
        hotDog(dict_Set, "hot", "dog");
        hotDog(dict_Set, "hit", "dog");
        hotDog(dict_Set, "hit", "dig");
        hotDog(dict_Set, "dot", "red");
    }
}