package za.ac.cput.domain;

import java.time.LocalDate;

public class Payment {
    private String paymentID;
    private String orderID;
    private LocalDate paymentDate;
    private Integer paymentAmount;
    private String paymentMethod;

    private Payment(){}

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Integer getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Integer paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID='" + paymentID + '\'' +
                ", orderID='" + orderID + '\'' +
                ", paymentDate=" + paymentDate +
                ", paymentAmount=" + paymentAmount +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
