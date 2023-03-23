package za.ac.cput.domain;

public class Sales {

        private String productName;
        private int quantity;
        private double price;

        private Sales(String productName, int quantity, double price) {
            this.productName = productName;
            this.quantity = quantity;
            this.price = price;
        }

        public String getProductName() {
            return productName;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getPrice() {
            return price;
        }

    @Override
    public String toString() {
        return "Sales{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public static class Builder {
            private String productName;
            private int quantity;
            private double price;

            public Builder setProductName(String productName) {
                this.productName = productName;
                return this;
            }

            public Builder setQuantity(int quantity) {
                this.quantity = quantity;
                return this;
            }

            public Builder setPrice(double price) {
                this.price = price;
                return this;
            }
            public Builder copy (Sales sales){
                this.productName = sales.productName;
                this.quantity = sales.quantity;
                this.price = sales.price;
                return this;
            }

            public Sales build() {
                return new Sales(productName, quantity, price);
            }
        }
    }


