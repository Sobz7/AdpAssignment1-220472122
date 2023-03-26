// PaymentFactory.java
// Entity for the Payment.
// Author: Sobantu Malotana (220472122)
// Date: 24 March 202
package za.ac.cput.factory;

import za.ac.cput.domain.Payment;

import java.time.LocalDate;

public class PaymentFactory {

    public static Payment createPayment(String paymentID, String orderID, LocalDate paymentDate, double paymentAmount, String paymentMethod){
        return new Payment.Builder().setpaymentID(paymentID)
                .setorderID(orderID)
                .setpaymentDate(paymentDate)
                .setpaymentAmount(paymentAmount)
                .setpaymentMethod(paymentMethod)
                .build();
    }
}
