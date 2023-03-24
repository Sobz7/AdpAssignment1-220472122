package za.ac.cput.domain;

public class Inventory {

    private String productId;
    private int quantity;
    private int reorderQuantity;

    private Inventory(String productId, int quantity, int reorderQuantity) {
        this.productId = productId;
        this.quantity = quantity;
        this.reorderQuantity = reorderQuantity;
    }
    private  Inventory(Builder builder) {
        this.productId = builder.productId;
        this.quantity = builder.quantity;
        this.reorderQuantity = builder.reorderQuantity;
    }

    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getReorderQuantity() {
        return reorderQuantity;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "productId='" + productId + '\'' +
                ", quantity=" + quantity +
                ", reorderQuantity=" + reorderQuantity +
                '}';
    }

    public static class Builder {
        private String productId;
        private int quantity;
        private int reorderQuantity;

        public Builder setProductId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setReorderQuantity(int reorderQuantity) {
            this.reorderQuantity = reorderQuantity;
            return this;
        }
        public Builder copy (Inventory inventory){
            this.productId = productId;
            this.quantity = quantity;
            this.reorderQuantity = reorderQuantity;
            return this;
        }


        public Inventory build() {
            return new Inventory(productId, quantity, reorderQuantity);
        }
    }
}




