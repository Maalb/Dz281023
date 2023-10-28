public class StrChars {
    public static void main(String[] args) {
        char[] chary = {87, 91, 89, 90};
        System.out.println(newString(chary));
    }

    static String newString(char[] ch){

        String string = String.valueOf(ch[0]);
        for (int i =1; i <ch.length; i++ ){
            string += string.valueOf(ch[i]);
        }
        return string;
    }
}
