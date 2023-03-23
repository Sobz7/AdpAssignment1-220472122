package za.ac.cput.domain;

public class Inventory {
    private String itemName;
    private int quantity;
    private double price;

    private Inventory(String itemName, int quantity, double price ) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;

    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "itemName='" + itemName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public static class Builder {
        private String itemName;
        private int quantity;
        private double price;

        public Builder setItemName(String itemName) {
            this.itemName = itemName;
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

        public Builder copy (Inventory inventory) {
            this.itemName = inventory.itemName;
            this.quantity = inventory.quantity;
            this.price = inventory.price;
            return this;
        }
        public Inventory build() {
            return new Inventory(itemName, quantity, price);
        }


    }
}
