package za.ac.cput.domain;

import java.time.LocalDate;

public class Payment {
    private String paymentID;
    private String orderID;
    private LocalDate paymentDate;
    private Integer paymentAmount;
    private String paymentMethod;

    private Payment(){}
    
    public Payment(Builder builder) {
        this.paymentID = builder.paymentID;
        this.orderID = builder.orderID;
        this.paymentDate = builder.paymentDate;
        this.paymentAmount = builder.paymentAmount;
        this.paymentMethod = builder.paymentMethod;
    }

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
     public static class Builder {

        private String paymentID;
        private String orderID;
        private LocalDate paymentDate;
        private Integer paymentAmount;
        private String paymentMethod;



        public Builder setpaymentID(String paymentID) {
            this.paymentID = paymentID;
            return this;
        }
        public Builder setorderID(String orderID) {
            this.orderID = orderID;
            return this;
        }

        public Builder setpaymentDate(LocalDate paymentDate) {
            this.paymentDate = paymentDate;
            return this;
        }
        public Builder setpaymentAmount(Integer paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public Builder setpaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }
        public Builder copy (Payment payment){
            this.paymentID = payment.paymentID;
            this.orderID = payment.orderID;
            this.paymentAmount = payment.paymentAmount;
            this.paymentDate = payment.paymentDate;
            this.paymentMethod = payment.paymentMethod;
            return this;
        }

        public Payment build(){
            return new Payment(this);
        }
    }



}
