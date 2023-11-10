package Garage;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    public Map<String, Integer> garage = new HashMap<>();

    String type;
    Integer colvo;


    public Garage(String type, Integer colvo) {
        this.type = "bus";
        this.colvo = 1;
    }

    public Integer carGoOut(String nameType){
        if (garage.get(nameType)>0) {
            return garage.put(nameType, garage.get(nameType) - 1);
        }else{
            return garage.put(nameType, garage.get(nameType));
        }
    }

    public Integer carGoIn(String nameType){
        if (garage.containsKey(nameType)) {
            return garage.put(nameType, garage.get(nameType) + 1);
        }else{
            return garage.put(nameType, 1);
        }
    }

    @Override
    public String toString() {
        return garage.toString();
    }
}



