package ArrayList.employee.first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Employee class
class Employee {
    private int id;
    private String designation;
    private double salary;

    // Constructor
    public Employee(int id, String designation, double salary) {
        this.id = id;
        this.designation = designation;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeManagerByDecendingOrder {
    public static void main(String[] args) {
        // List of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Manager", 75000));
        employees.add(new Employee(2, "Developer", 50000));
        employees.add(new Employee(3, "Designer", 60000));
        employees.add(new Employee(4, "Tester", 45000));

        // Sort in descending order by salary
        employees.sort(Comparator.comparingDouble(Employee::getSalary).reversed());

        // Print sorted employees
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
