 import java.util.*;

// Employee class definition
class Employee {
    int id;
    String name;
    double salary;

    // Constructor
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Display method
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeListApp {
    public static void main(String[] args) {
        // Create ArrayList to store Employee objects
        ArrayList<Employee> empList = new ArrayList<>();

        // Add 5 Employee objects
        empList.add(new Employee(101, "Alice", 50000));
        empList.add(new Employee(102, "Bob", 55000));
        empList.add(new Employee(103, "Charlie", 60000));
        empList.add(new Employee(104, "David", 65000));
        empList.add(new Employee(105, "Emma", 70000));

        // Display all employees
        System.out.println("Employee Details:");
        for (Employee e : empList) {
            e.display();
        }
    }
}
