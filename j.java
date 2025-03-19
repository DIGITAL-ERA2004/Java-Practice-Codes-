import java.util.*;
public class j{  // Single class to hold everything

    int empId;
    String name;
    double salary;

    // Constructor to initialize employee details
    public j(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details if salary > 5000
    public void display() {
        if (this.salary > 5000) {
            System.out.println("ID: " + empId + ", Name: " + name + ", Salary: $" + salary);
        }
    }

    // Main method to create employees and display those earning more than $5000
    public static void main(String[] args) {
        // Creating Employee objects
        j emp1 = new  j(1, "Alice", 6000);
        j emp2 = new  j(2, "Bob", 4500);
      j emp3 = new j(3, "Kantrao", 47700);

        // Displaying the message for employees earning more than $5000
        System.out.println("Employees earning more than $5000:");

        // Displaying employees that meet the condition
        emp1.display();  // Alice will be displayed
        emp2.display();  // Bob will not be displayed (salary < 5000)
        emp3.display();  // Kantrao will be displayed (salary > 5000)
    }
}
