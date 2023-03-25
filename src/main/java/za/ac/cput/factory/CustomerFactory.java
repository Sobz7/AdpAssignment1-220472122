//CustomerFactory.java
// Entity for the Employee
// Author: Jordy Meye (220072841)
// Date: 24 03 2023

package za.ac.cput.factory;

import za.ac.cput.domain.Customer;
import za.ac.cput.util.Helper;

public class CustomerFactory  {

    public static Customer createCustomer(String name, String surname, String email){
        if(!Helper.isValidEmail(email))

            return null;

            if(Helper.isNullorEmpty(name)|| Helper.isNullorEmpty(surname))
                return null;

        return new Customer.Builder().setName(name).setSurname(surname).setEmail(email).build();
    }
}
