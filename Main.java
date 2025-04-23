package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main (String[] args) {
        Order order = new Order("GJ56758", "Nguyen Thi Minh Phuong", 1200000);
        order.showInfo();
        System.out.println("Giảm giá 10% cho đơn hàng: ");
        double discount = order.getTotalAmount() * 0.1;
        order.setTotalAmount(discount);
        order.showInfo();
    }
}