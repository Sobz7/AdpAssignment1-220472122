package za.ac.cput.domain;

public class Order {

    private String orderId;
    private String customerId;

    private Order() {
    }

    public Order(Builder builder) {
        this.orderId = builder.orderId;
        this.customerId = builder.customerId;

    }

    public String getId() {
        return orderId;
    }

    public void setId(String id) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }


    public static class Builder {

        private String orderId;
        private String customerId;

        public Order.Builder setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Order.Builder setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public Order.Builder copy(Order order) {
            this.orderId = order.orderId;
            this.customerId = order.customerId;

            return this;
        }

        public Order build() {
            return new Order(this);
        }

    }
}