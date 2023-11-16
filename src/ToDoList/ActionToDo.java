package ToDoList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TooManyListenersException;

import static ToDoList.ToDo.toDoList;

public class ActionToDo {
    public static void main(String[] args) {

        ToDo.toDoList.put(1, "Гулять с собакой");
        ToDo.toDoList.put(2, "Гулять с кошкой");
        ToDo.toDoList.put(3, "Гулять с попугаем");
        ToDo.toDoList.put(4, "Гулять с анакондой");

        Scanner scanner = new Scanner(System.in);
        String deal = scanner.nextLine();
        ToDo.deal = deal;
        String[] deals = deal.split(" ");
        acting(deals);

    }
    public static void acting(String[] newdeal){
        if (newdeal[0].equals("LIST")){
            System.out.println(toDoList);
        } else if(newdeal[0].equals("ADD")){
            boolean digit1 = ToDo.isDig(newdeal);
            String newString = ToDo.newSring1(digit1, newdeal);
            ToDo.addDo(newdeal, newString);
        } else if (newdeal[0].equals("EDIT")) {
            boolean digit2 = ToDo.isDig(newdeal);
            String newString2 = ToDo.newSring1(digit2, newdeal);
            ToDo.editDo(newdeal, newString2);
        } else if (newdeal[0].equals("DELETE")) {
            ToDo.deleteDo(newdeal);
        } else {
            System.out.println("Нет такого дела");
        }

    }

    }
