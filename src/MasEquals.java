public class MasEquals {
    public static void main(String[] args) {
        int[] mas1 ={1, 2, 3, 5, 7};
        int[] mas2={1, 2, 3, 5, 7};
        System.out.println(ravnySassives(mas1, mas2));
    }
    static boolean ravnySassives(int[] m1, int[] m2){
        boolean ravLenght = m1.length==m2.length ? true : false;
        if (ravLenght==true) {
            int ravUnit = 0;
            for (int i = 0; i < m1.length; i++) {
                if (m1[i] == m2[i]) {
                    ravUnit += 1;
                }
            }
            if (ravUnit == m1.length) {
                return true;
            } else {
                return false;
            }

        }else {
            return false;
        }
    }
}
