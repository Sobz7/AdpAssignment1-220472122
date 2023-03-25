package za.ac.cput.domain;

import java.time.LocalDate;

public class Sales {
    private  int salesId;
    private  String productId;
    private  int quantity;
    private  double totalPrice;
    private  LocalDate saleDate;

    private Sales(Builder builder) {
        this.salesId = builder.salesId;
        this.productId = builder.productId;
        this.quantity = builder.quantity;
        this.totalPrice = builder.totalPrice;
        this.saleDate = builder.saleDate;
    }

    public int getSalesId() {
        return salesId;
    }

    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "salesId=" + salesId +
                ", productId='" + productId + '\'' +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                ", saleDate=" + saleDate +
                '}';
    }

    public static class Builder {
        private int salesId;
        private String productId;
        private int quantity;
        private double totalPrice;
        private LocalDate saleDate;

        public Builder setSalesId(int salesId) {
            this.salesId = salesId;
            return this;
        }

        public Builder setProductId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setTotalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        public Builder setSaleDate(LocalDate saleDate) {
            this.saleDate = saleDate;
            return this;
        }
        public Builder copy (Sales sale) {
            this.salesId = salesId;
            this.productId = productId;
            this.quantity = quantity;
            this.totalPrice = totalPrice;
            this.saleDate = saleDate;
            return this;
        }

        public Sales build() {
            return new Sales(this);
        }
    }
}




