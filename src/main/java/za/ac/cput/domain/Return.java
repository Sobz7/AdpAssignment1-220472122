package za.ac.cput.domain;

public class Return {
    private String ReturnId;
    private String OrderId;
    private String Reason;

    private Return(){

    }

    public String getReturnId() {
        return ReturnId;
    }

    public void setReturnId(String returnId) {
        ReturnId = returnId;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    @Override
    public String toString() {
        return "Return{" +
                "ReturnId='" + ReturnId + '\'' +
                ", OrderId='" + OrderId + '\'' +
                ", Reason='" + Reason + '\'' +
                '}';
    }
}
