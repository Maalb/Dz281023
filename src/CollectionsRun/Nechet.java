package CollectionsRun;

import java.util.ArrayList;
import java.util.List;

import java.util.Set;
import java.util.HashSet;

public class Nechet {
    public static void main(String[] args) {
        ArrayList<Integer> mix = new ArrayList<>(){};

        mix.add(1);
        mix.add(4);
        mix.add(6);
        mix.add(7);
        mix.add(8);
        mix.add(8);

        System.out.println(mix);
        System.out.println(countUnique(mix));
        System.out.println(countUnique2(mix));
        System.out.println(mixmix(mix));

    }

    static List<Integer> mixmix (ArrayList<Integer> mix1) { // метод заданийе 1
        List<Integer> mix2 = new ArrayList<>() {
        };
        for (int i = 0, j=0; i < mix1.size(); i++) {
            if (mix1.get(i) % 2 != 0) {
                mix2.add(mix1.get(i));
                j++;
            }
        }
        return mix2;
    }

    static int countUnique(ArrayList<Integer> mix1) { // метод задание 2
        List mix2 = new ArrayList<>() {
        };
        for (int i = 0; i < mix1.size(); i++) {
            if (mix2.contains(mix1.get(i))) {
            } else {
                mix2.add(mix1.get(i));
            }
        }
        return mix2.size();
    }

    static int countUnique2(ArrayList<Integer> mix1) { // метод задание 2 c HashSet

        Set<Integer> mix2 = new HashSet<>(mix1);
        return mix2.size();
    }

}
