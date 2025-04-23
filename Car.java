package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Car {
    private String brand;
    private String model;
    private int year;
    private double speed;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = 0.0;
    }
    // Getter cho thông tin xe
    String getBrand() {
        return brand;
    }
    String getModel() {
        return model;
    }
    int getYear() {
        return year;
    }
    double getSpeed() {
        return speed;
    }
    // Setter tăng tốc xe
    public void accelerate(int increase){
        if (increase >0){
        speed += increase;
        System.out.println("Toc do tang len: " + speed + " km/h");
    } else {
        System.out.println("Khong the tang toc do bang so am");
    }
    }
    // Setter giảm tốc độ xe
    public void brake(int decrease){
        if (decrease >0 && speed>= decrease){
        speed -= decrease;
        System.out.println("Toc do giam xuong: " + speed + " km/h");
    } else {
        speed = 0;
        System.out.println("Toc do xe da ve 0 km/h");
    }
    }
    // Setter hiển thị thông tin xe
    public void showInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Speed: " + speed + " km/h");
    }
}