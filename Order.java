package org.example;

class Order {
    private String orderId;
    private String customerName;
    private double totalAmount;

    //constructor
    public Order(String orderId, String customerName, double totalAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    //getters lấy thông tin đặt hàng
    String getOrderId() {
        return orderId;
    }
    String getCustomerName() {
        return customerName;
    }
    double getTotalAmount() {
        return totalAmount;
    }

    //setter giảm giá trên tổng tiền
    public void setTotalAmount(double discount) {
        this.totalAmount -= discount;
    }

    //setter hiển thị thông tin đơn hàng
    public void showInfo() {
        System.out.println("Mã đơn hàng: " + orderId);
        System.out.println("Tên khách hàng: " + customerName);
        System.out.println("Tổng tiền: " + totalAmount);
    }

}
