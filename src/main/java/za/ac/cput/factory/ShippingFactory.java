// Shipping.Factory.java
// Factory for the Shipping.
// Author: Sobantu Malotana (220472122)
// Date: 24 March 202

package za.ac.cput.factory;

import za.ac.cput.domain.Shipping;

import java.time.LocalDate;

public class ShippingFactory {
    public static Shipping createShipping(String shippingID, String orderID, String carrierName, Integer trackingNumber, LocalDate shippingDate, LocalDate deliveryDate){
        return new Shipping.Builder().setshippingID(shippingID)
                .setorderID(orderID)
                .setcarrierName(carrierName)
                .settrackingNumber(trackingNumber)
                .setshippingDate(shippingDate)
                .setdeliveryDate(deliveryDate)
                .build();
    }
}
