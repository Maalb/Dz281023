package ToDoList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TooManyListenersException;

public class ActionToDo {
    public static void main(String[] args) {
        Map<Integer,String> toDoList = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String deal = scanner.nextLine();
        ToDo.deal = deal;
        String[] deals = deal.split(" ");


    }
    public void acting(String[] newdeal){
        if (newdeal[0].equals("LIST")){
            System.out.println(ToDo.toDoList);
        } else if(newdeal[0].equals("ADD")){
            boolean digit1 = ToDo.isDig(newdeal);
            String newString = ToDo.newSring1(digit1, newdeal);
            ToDo.addDo(newdeal, newString);
        } else if (newdeal[0].equals("EDIT")) {

        }

    }
