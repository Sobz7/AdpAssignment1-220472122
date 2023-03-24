package za.ac.cput.domain;

public class Return {
    private String returnId;
    private String orderId;
    private String reason;

    public Return(String returnId, String orderId, String reason) {
        this.returnId = returnId;
        this.orderId = orderId;
        this.reason = reason;
    }

    public String getReturnId() {
        return returnId;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getReason() {
        return reason;
    }

    public static class ReturnBuilder{
        private String returnId;
        private String orderId;
        private String reason;

        public ReturnBuilder setReturnId(String returnId){
            this.returnId = returnId;
            return this;
        }

        public ReturnBuilder setOrderId(String orderId){
            this.orderId = orderId;
            return this;
        }

        public ReturnBuilder setReason(String reason){
            this.reason = reason;
            return this;
        }

        public Return build(){
            return new Return(returnId,orderId,reason);
        }

    }

}
