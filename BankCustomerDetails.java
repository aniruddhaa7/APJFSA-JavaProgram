package APJSC9550;

public class BankCustomerDetails {
    private int acno;
    private String atype;
    private double amt;

    // Constructor with all fields
    public  BankCustomerDetails(int acno, String atype, double amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }

    // Constructor with account number and account type only
    public  BankCustomerDetails(int acno, String atype) {
        this.acno = acno;
        this.atype = atype;
        this.amt = 0.0; // Default amount
    }

    // Constructor with account number only
    public  BankCustomerDetails(int acno) {
        this.acno = acno;
        this.atype = "Savings"; // Default account type
        this.amt = 0.0; // Default amount
    }

    // Method to display customer details
    public void displayCustomerDetails() {
        System.out.println("Account Number: " + acno);
        System.out.println("Account Type: " + atype);
        System.out.println("Amount: " + amt);
    }

    public static void main(String[] args) {
        // Using different constructors
    	 BankCustomerDetails customer1 = new  BankCustomerDetails(123456, "Savings", 5000.00);
    	 BankCustomerDetails customer2 = new  BankCustomerDetails(789012, "Current");
    	 BankCustomerDetails customer3 = new  BankCustomerDetails(345678);

        System.out.println("Customer 1 Details:");
        customer1.displayCustomerDetails();

        System.out.println("\nCustomer 2 Details:");
        customer2.displayCustomerDetails();

        System.out.println("\nCustomer 3 Details:");
        customer3.displayCustomerDetails();
    }
}

/*
 * OUTPUT:
 * Customer 1 Details:
 * Account Number: 123456
 * Account Type: Savings
 * Amount: 5000.0
 *
 * Customer 2 Details:
 * Account Number: 789012
 * Account Type: Current
 * Amount: 0.0
 *
 * Customer 3 Details:
 * Account Number: 345678
 * Account Type: Savings
 * Amount: 0.0
 */
