package automobile;

import automobile.fourwheeler.*;

public class TestFourWheeler {
    public static void main(String[] args) {

        Ford f = new Ford();
        Logan l = new Logan();
        System.out.println("FORD Class:");
        System.out.println("Model Name: " + f.getModelName());
        System.out.println("Registration Number: " + f.getRegistrationNumber());
        System.out.println("Owner Name: " + f.getOwnerName());
        System.out.println("Speed: " + f.speed());
        System.out.println("Temperature: " + f.tempControl());
        System.out.println();
        System.out.println("LOGAN Class:");
        System.out.println("Model Name: " + l.getModelName());
        System.out.println("Registration Number: " + l.getRegistrationNumber());
        System.out.println("Owner Name: " + l.getOwnerName());
        System.out.println("Speed: " + l.speed());
        System.out.println("GPS: " + l.gps());
    }
}
