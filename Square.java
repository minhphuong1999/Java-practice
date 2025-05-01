package org.example;

class Square extends Shape {
    double side;
    Square(double side) {
        this.side = side;
    }
    @Override
    double getArea() {
        return side * side;
    }
}
