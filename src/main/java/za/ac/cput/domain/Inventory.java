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


    public static class InventoryBuilder {
        private String itemName;
        private int quantity;
        private double price;

        public InventoryBuilder setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }

        public InventoryBuilder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public InventoryBuilder setPrice(double price) {
            this.price = price;
            return this;
        }


        public Inventory build() {
            return new Inventory(itemName, quantity, price);
        }


    }
}
