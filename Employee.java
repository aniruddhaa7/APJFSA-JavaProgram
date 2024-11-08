package APJSC9550;

public class Employee {
 private int empId;
 private String empName;
 private int empAge;
 private double empSalary;

 // Parameterized Constructor
 public Employee(int empId, String empName, int empAge, double empSalary) {
     this.empId = empId;
     this.empName = empName;
     this.empAge = empAge;
     this.empSalary = empSalary;
 }

 // Getter methods
 public int getEmpId() {
     return empId;
 }

 public String getEmpName() {
     return empName;
 }

 public int getEmpAge() {
     return empAge;
 }

 public double getEmpSalary() {
     return empSalary;
 }

 // Display Employee Details
 public void displayEmployeeDetails() {
     System.out.println("Employee ID: " + empId);
     System.out.println("Employee Name: " + empName);
     System.out.println("Employee Age: " + empAge);
     System.out.println("Employee Salary: " + empSalary);
 }

 public static void main(String[] args) {
     // Creating an Employee object using the parameterized constructor
     Employee employee = new Employee(101, "John Doe", 30, 75000.00);
     
     // Displaying employee details
     employee.displayEmployeeDetails();
 }
}

/*
* OUTPUT:
* Employee ID: 101
* Employee Name: John Doe
* Employee Age: 30
* Employee Salary: 75000.0
*/
