// Payment.Domain.java
// POJO for the Payment
// Author: Sobantu Malotana (220472122)
// Date: 20 March 2023

package za.ac.cput.domain;

import java.time.LocalDate;

public class Payment {
    private String paymentId;
    private String orderId;
    private LocalDate paymentDate;
    private double paymentAmount;
    private String paymentMethod;

    private Payment(){}

    public Payment(Builder builder) {
        this.paymentId = builder.paymentId;
        this.orderId = builder.orderId;
        this.paymentDate = builder.paymentDate;
        this.paymentAmount = builder.paymentAmount;
        this.paymentMethod = builder.paymentMethod;
    }
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
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
                "paymentId='" + paymentId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", paymentDate=" + paymentDate +
                ", paymentAmount=" + paymentAmount +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
    public static class Builder {

        private String paymentId;
        private String orderId;
        private LocalDate paymentDate;
        private double paymentAmount;
        private String paymentMethod;



        public Builder setpaymentId(String paymentId) {
            this.paymentId = paymentId;
            return this;
        }
        public Builder setorderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder setpaymentDate(LocalDate paymentDate) {
            this.paymentDate = paymentDate;
            return this;
        }
        public Builder setpaymentAmount(double paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public Builder setpaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }
        public Builder copy (Payment payment){
            this.paymentId = payment.paymentId;
            this.orderId = payment.orderId;
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
