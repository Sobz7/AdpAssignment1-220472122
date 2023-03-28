// PaymentFactory.java
// Entity for the Payment.
// Author: Sobantu Malotana (220472122)
// Date: 24 March 202
package za.ac.cput.factory;

import za.ac.cput.domain.Payment;

import java.time.LocalDate;

public class PaymentFactory {

    public static Payment createPayment(String paymentId, String orderId, LocalDate paymentDate, double paymentAmount, String paymentMethod){
        return new Payment.Builder().setpaymentId(paymentId)
                .setorderId(orderId)
                .setpaymentDate(paymentDate)
                .setpaymentAmount(paymentAmount)
                .setpaymentMethod(paymentMethod)
                .build();
    }
}
