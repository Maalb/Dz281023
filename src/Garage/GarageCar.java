package Garage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GarageCar {
    public static void main(String[] args) {
        Bus busBlue = new Bus("Bus", "Volvo", "Vita", 17, "Blue");
        Track trackBlack = new Track("Track", "Volvo", "Vita2", 30, "Black");
        Bus greenBus = new Bus("Bus", "Mers", "Vivo2", 12, "green");
        Cabrio yellowCab = new Cabrio("Cabio", "alfa", "vitar", 25, "yellow");

        Garage garage1 = new Garage(busBlue.getType(), 1);
        garage1.carGoIn(trackBlack.getType());
        garage1.carGoIn(greenBus.getType());
        garage1.carGoIn(yellowCab.getType());

        System.out.println(garage1);

    }

}
