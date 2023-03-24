package za.ac.cput.domain;

import java.time.LocalDate;

public class Shipping {
    private String shippingID;
    private String orderID;
    private String carrierName;
    private Integer trackingNumber;
    private LocalDate shippingDate;
    private LocalDate deliveryDate;

    private Shipping(){}

    public String getShippingID() {
        return shippingID;
    }

    public void setShippingID(String shippingID) {
        this.shippingID = shippingID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public Integer getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(Integer trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public LocalDate getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(LocalDate shippingDate) {
        this.shippingDate = shippingDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "Shipping{" +
                "shippingID='" + shippingID + '\'' +
                ", orderID='" + orderID + '\'' +
                ", carrierName='" + carrierName + '\'' +
                ", trackingNumber=" + trackingNumber +
                ", shippingDate=" + shippingDate +
                ", deliveryDate=" + deliveryDate +
                '}';
    }
     public static class Builder {

        private String shippingID;
        private String orderID;
        private String carrierName;
        private Integer trackingNumber;
        private LocalDate shippingDate;
        private LocalDate deliveryDate;



        public Builder setshippingID(String shippingID) {
            this.paymentID = paymentID;
            return this;
        }
        public Builder setorderID(String orderID) {
            this.orderID = orderID;
            return this;
        }

        public Builder setcarrierName(String carrierName) {
            this.carrierName = carrierName;
            return this;
        }
        public Builder settrackingNumber(Integer trackingNumber) {
            this.trackingNumber = trackingNumber;
            return this;
        }
        public Builder setshippingDate(LocalDate shippingDate) {
            this.shippingDate = shippingDate;
            return this;
        }
         public Builder setdeliveryDate(LocalDate deliveryDate) {
            this.deliveryDate = deliveryDate;
            return this;
        }
        public Builder copy (Shipping shipping){
            this.paymentID = shipping.paymentID;
            this.orderID = shipping.orderID;
            this.carrierName = shipping.carrierName;
            this.trackingNumber = shipping.trackingNumber;
            this.shippingDate = shipping.shippingDate;
            this.deliveryDate = shipping.deliveryDate;
            return this;
        }

        public Shipping build(){
            return new Shipping(this);
        }
    }


}
