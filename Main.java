package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Chọn số tương ứng với hình cần tính diện tích: 1. Hình Vuông; 2. Hình Chữ Nhật; 3. Hình Tròn; 4. Hình Tam Giác; 5. Thoát");
            while (!scanner.hasNextInt()) {
                System.out.println("Vui lòng nhập số nguyên từ 1 đến 5:");
                scanner.next(); // Clear the invalid input
            }
            number = scanner.nextInt();
            if (number < 1 || number > 5) {
                System.out.println("Vui lòng nhập số từ 1 đến 5");
                continue; // Skip the rest of the loop and ask for input again
            }
            Shape shape = null;
            switch (number) {
                case 1:
                    System.out.println("Nhập cạnh hình vuông");
                    double side = scanner.nextDouble();
                    shape = new Square(side);
                    System.out.println("Diện tích hình vuông là: " + shape.getArea());
                    break;
                case 2:
                    System.out.println("Nhập chiều dài hình chữ nhật");
                    double length = scanner.nextDouble();
                    System.out.println("Nhập chiều rộng hình chữ nhật");
                    double width = scanner.nextDouble();
                    shape = new Rectangle(length, width);
                    System.out.println("Diện tích hình chữ nhật là: " + shape.getArea());
                    break;
                case 3:
                    System.out.println("Nhập bán kính hình tròn");
                    double radius = scanner.nextDouble();
                    shape = new Circle(radius);
                    System.out.println("Diện tích hình tròn là: " + shape.getArea());
                    break;
                case 4:
                    System.out.println("Nhập chiều cao tam giác");
                    double height = scanner.nextDouble();
                    System.out.println("Nhập đáy tam giác");
                    double base = scanner.nextDouble();
                    shape = new Triangle(height, base);
                    System.out.println("Diện tích hình tam giác là: " + shape.getArea());
                    break;
                case 5:
                    System.out.println("Đa thoat chương trình");
                    break;
                default:
                    System.out.println("Vui lòng nhập số từ 1 đến 5");
                    continue; // Skip the rest of the loop and ask for input again
            }
        } while (number != 5);

    }
}