package org.example;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Mercerdes", "Maybach", 2024);
        myCar.showInfo();
        myCar.accelerate(40);
        myCar.brake(17);
        myCar.showInfo();
    }
}
