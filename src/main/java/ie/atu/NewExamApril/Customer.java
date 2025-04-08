package ie.atu.NewExamApril;

public class Customer {

    private String firstName;
    private String lastName;
    private String customerID;
    private String address;

    public Customer(String firstName, String lastName, String customerID, String address)
    {
        if(firstName.length() < 3)
        {
            throw new IllegalArgumentException("First name has to be more than 3 characters.");
        }
        if(lastName.length() < 3)
        {
            throw new IllegalArgumentException("Last name has to be more than 3 characters.");
        }
        if(customerID.length() < 8 || customerID.length() > 12)
        {
            throw new IllegalArgumentException("Customer ID has to be between 8 to 12 characters.");
        }
        if(address.length() < 10 || address.length() > 40)
        {
            throw new IllegalArgumentException("Address has to be between 10 to 40 characters.");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.customerID = customerID;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getAddress() {
        return address;
    }
}