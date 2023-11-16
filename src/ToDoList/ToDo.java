package ToDoList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class ToDo {
    public static Map<Integer, String> toDoList = new HashMap<>();
    static Integer number;
    static String deal;

    public ToDo(Integer number, String deal) {
        this.number = number;
        this.deal = deal;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDeal() {
        return deal;
    }

    public void setDeal(String deal) {
        this.deal = deal;
    }

    static boolean isDig(String[] n){
        if (n[1].chars().allMatch( Character::isDigit )) {
            return true;
        } else {
            return false;
        }
    }

    public static String newSring1 (boolean bol, String[] newdeal){
        String newStr = "";
        if (bol){
            for (int j = 2; j < newdeal.length; j++) {
                newStr += ((String) newdeal[j] + " ");
            }
        } else {
            for (int j = 1; j < newdeal.length; j++) {
                newStr += ((String) newdeal[j] + " ");
            }
    }
        return newStr;

}
    public static void addDo(String[] newdeal, String newStr){
        if (newdeal[1].chars().allMatch( Character::isDigit )) {
            String nomerOne = newdeal[1];
            Integer kei1 = Integer.parseInt(nomerOne);
            if (toDoList.containsKey(kei1)) {
                toDoList.put(Integer.valueOf(newdeal[1]), newStr);
                System.out.println("Добавлено дело \"" + newStr + "\"");
            }
        } else {
            toDoList.put(toDoList.size()+1, newStr);
            System.out.println("Добавлено дело \"" + newStr + "\"");
        }
        System.out.println(toDoList);

    }
    public static void editDo(String[] newdeal, String newStr){
        String nomerOne = newdeal[1];
        Integer kei1 = Integer.parseInt(nomerOne);
        if (toDoList.containsKey(kei1)){
            System.out.println("Дело \"" + toDoList.get(kei1)
                    + "\"" + " заменено на "+ "\"" + newStr + "\"");
            toDoList.replace(Integer.valueOf(newdeal[1]), newStr);
        }else {
            System.out.println("Элемент не найден");
        }
    }

    public static void deleteDo(String[] newdeal){
        String nomerOne = newdeal[1];
        Integer kei1 = Integer.parseInt(nomerOne);
        if (toDoList.containsKey(kei1)){
            System.out.println("Дело \"" + toDoList.get(kei1)
                    + "\"" + " удалено" );
            toDoList.remove(Integer.valueOf(newdeal[1]));
            System.out.println(toDoList);
        }else {
            System.out.println("Элемент не найден");
        }
    }
}
