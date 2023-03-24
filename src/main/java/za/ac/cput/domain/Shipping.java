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
}
