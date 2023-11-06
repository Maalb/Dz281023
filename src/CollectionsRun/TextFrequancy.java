
package CollectionsRun;

import java.util.HashMap;
import java.util.Map;


public class TextFrequancy {
    public static void main(String[] args) {
        String s = "Вот уже пять лет, как его не расщепляли на атомы. " +
                "Вот уже четыре года (со дня расставания с Фордом Префектом) " +
                "Артур в общем-то ни одной души не видел, а потому и оскорблениям " +
                "больше не подвергался. За исключением одного случая. " +
                "Это произошло как-то весенним вечером года два тому назад.";

        System.out.println(words(s));
    }
    static Map words(String bezZnakov){
        Map<String, Integer> words1 = new HashMap<>();
        String[] ss = bezZnakov.split(" ");
        for (String word: ss) {
            if (words1.containsKey(word)){
                words1.put(word, words1.get(word) +1);
            } else {
                words1.put(word, 1);
            }
        }
        return words1;
    }
    static String bezZnakov(String sss){
        String ss = sss.replaceAll("[^A-Za-zА-Яа-я0-9]", " ");
        return ss;
    }
}
