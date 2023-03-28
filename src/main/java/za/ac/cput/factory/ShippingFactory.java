// Shipping.Factory.java
// Factory for the Shipping.
// Author: Sobantu Malotana (220472122)
// Date: 24 March 202

package za.ac.cput.factory;

import za.ac.cput.domain.Shipping;
import za.ac.cput.util.Helper;

import java.time.LocalDate;

public class ShippingFactory {
    public static Shipping createShipping(String shippingId, String orderId, String carrierName, Integer trackingNumber,
                                          LocalDate shippingDate, LocalDate deliveryDate)
    {
        if(Helper.isNullorEmpty(shippingId) || Helper.isNullorEmpty(orderId))
            return null;

        return new Shipping.Builder().setshippingId(shippingId)
                .setorderId(orderId)
                .setcarrierName(carrierName)
                .settrackingNumber(trackingNumber)
                .setshippingDate(shippingDate)
                .setdeliveryDate(deliveryDate)
                .build();
    }
}
