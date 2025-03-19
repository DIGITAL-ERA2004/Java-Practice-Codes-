import java.util.*;

public class Slip2Employee 
{
    int Id;
    String name;
    double salary;

    Slip2Employee(int Id, String name, double salary) 
    {
        this.Id = Id;
        this.name = name;
        this.salary = salary;
    }


    public void display() 
    {
        if (this.salary > 5000) 
        {
            System.out.println("ID:" + Id);
            System.out.println("Name: " + name);
            System.out.println("ID: " + salary);

        }
    }

    public static void main(String[] args) 
    {
        Slip2Employee emp1 = new Slip2Employee(1, "Kantrao", 6000);
        Slip2Employee emp2 = new Slip2Employee(2, "Supriya", 45900);
        Slip2Employee emp3 = new Slip2Employee(3, "Tanishq", 7000);
        Slip2Employee emp4 = new Slip2Employee(3, "Sushant", 7000);


        System.out.println("Employees earning more than $5000:");

        emp1.display();
        emp2.display();
        emp3.display();
        emp4.display();
    }
}
