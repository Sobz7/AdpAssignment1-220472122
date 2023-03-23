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

            public Sales build() {
                return new Sales(productName, quantity, price);
            }
        }
    }


