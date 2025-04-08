import ie.atu.NewExamApril.Customer;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.*;

public class CustomerTest {

    @Test
    public void validFirstName() {
        Customer Emre = new Customer("Emre", "Demir", "123456789", "Galway,Atu");
        assertEquals("Emre", Emre.getFirstName());
    }

    @Test
    public void invalidFirstName() {
        Exception ex = assertThrows(IllegalArgumentException.class, () ->
        {
            new Customer("Em", "Demir", "123456789", "Galway,Atu");

        });

        assertEquals("First name has to be more than 3 characters.", ex.getMessage());


    }


    @Test
    public void validLastName() {
        Customer Emre = new Customer("Emre", "Demir", "123456789", "Galway,Atu");
        assertEquals("Demir", Emre.getLastName());
    }
    @Test
    public void invalidLastName()
    {
        Exception ex = assertThrows(IllegalArgumentException.class, () ->
        {
            new Customer("Emre", "De", "123456789", "Galway,Atu");

        });

        assertEquals("Last name has to be more than 3 characters.", ex.getMessage());


    }

}

