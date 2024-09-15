import java.util.HashMap;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String department;

    
    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department;
    }
}

public class EmployeeDirectory {
    public static void main(String[] args) {
        HashMap<Integer, Employee> employeeMap = new HashMap<>();
        
        employeeMap.put(101, new Employee(101, "Alice", "HR"));
        employeeMap.put(102, new Employee(102, "Bob", "Engineering"));
        employeeMap.put(103, new Employee(103, "Charlie", "Sales"));

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter employee ID to retrieve details: ");
        int employeeId = scanner.nextInt();
        
        Employee employee = employeeMap.get(employeeId);
        if (employee != null) {
            System.out.println("Employee found: " + employee);
        } else {
            System.out.println("Employee not found.");
        }

        scanner.close();
    }
}
