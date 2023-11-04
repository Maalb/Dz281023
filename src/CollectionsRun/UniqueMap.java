package CollectionsRun;

import java.util.*;


public class UniqueMap {
    public static void main(String[] args) {
        Map<String, String> names = new HashMap<>();

        names.put("Marty","Stepp");
        names.put("Stuart", "Reges");
        names.put("Jessica", "Miller");
        names.put("Amanda", "Camp");
        names.put("Hal", "Camp");

        System.out.println(mapUnique(names));

    }

    static boolean mapUnique(Map<String, String> map1){
        boolean unik = false;
        Collection<String> values = map1.values();
        Set<String> values1 = new HashSet<>(values);
        if (values1.size() == values.size()){
            unik = true;
        }
        return unik;
    }

}
