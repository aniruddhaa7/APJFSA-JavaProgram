package APJSC9550;

public class BankCustomer {
 private int acno;
 private String atype;
 private double amt;

 // Parameterized Constructor
 public BankCustomer(int acno, String atype, double amt) {
     this.acno = acno;
     this.atype = atype;
     this.amt = amt;
 }

 // Getter methods
 public int getAcno() {
     return acno;
 }

 public String getAtype() {
     return atype;
 }

 public double getAmt() {
     return amt;
 }

 // Method to display customer details
 public void displayCustomerDetails() {
     System.out.println("Account Number: " + acno);
     System.out.println("Account Type: " + atype);
     System.out.println("Amount: " + amt);
 }

 public static void main(String[] args) {
     // Creating a BankCustomer object using the parameterized constructor
     BankCustomer customer = new BankCustomer(123456, "Savings", 5000.00);
     
     // Displaying customer details
     customer.displayCustomerDetails();
 }
}

/*
* OUTPUT:
* Account Number: 123456
* Account Type: Savings
* Amount: 5000.0
*/
