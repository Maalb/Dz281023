package CollectionsRun;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Nechet {
    public static void main(String[] args) {
        ArrayList<Integer> mix = new ArrayList<>(){};

        mix.add(1);
        mix.add(4);
        mix.add(6);
        mix.add(7);
        mix.add(8);

        System.out.println(mix);
        System.out.println(mix1(mix));
    }

    static ArrayList<Integer> mix1 (ArrayList<Integer> mix1) {
        for (int i = 0; i < mix1.size(); i++) {
            if (mix1.get(i) % 2 == 0) {
                mix1.remove(mix1.get(i));
            }
        }
        return mix1;
    }
}
