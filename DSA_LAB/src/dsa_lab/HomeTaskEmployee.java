package dsa_lab;

import java.util.*;

class Employee {

    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        int result = 11;
        result =/*Prime No*/ 31 * result/*11*/ + name.hashCode();
        result =/*Prime No*/ 31 * result/*11*/ + id;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Employee e = (Employee) o;
        return id == e.id && name.equals(e.name);
    }

    @Override
    public String toString() {
        return "Employee: {Name: " + name + " Id: " + id + "}";
    }
}

class EmployeeManagement {

    private HashSet<Employee> hse;

    public EmployeeManagement() {
        hse = new HashSet<>();

    }

    public boolean addEmployee(Employee emp) {
        if (hse.contains(emp)) {
            System.out.println("Employee already exists: " + emp);
            return false;
        } else {
            hse.add(emp);
            System.out.println("Employee added: " + emp);
            return true;

        }
    }

    public boolean employeeExists(Employee employee) {
        return hse.contains(employee);
    }

    // Display all employees
    public void displayAllEmployees() {
        if (hse.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            System.out.println("Employee Records:");
            for (Employee emp : hse) {
                System.out.println(emp);
            }
        }
    }
}

public class HomeTaskEmployee {

    public static void main(String[] args) {
        EmployeeManagement em = new EmployeeManagement();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Select an Option:");
            System.out.println("1) Add an Employee:");
            System.out.println("2) Check Employee");
            System.out.println("3) Display all");
            System.out.println("4) Exit \n");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String n = sc.nextLine(); // Corrected: properly captures name
                    System.out.print("Enter Id: ");
                    int i = sc.nextInt();
                    sc.nextLine(); // Consume newline after integer input
                    Employee emp = new Employee(n, i);
                    em.addEmployee(emp);
                    break;
                case 2:
                    System.out.print("Enter Name: ");
                    String na = sc.nextLine();
                    System.out.print("Enter Id: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Consume newline after integer input
                    Employee empl = new Employee(na, id);
                    if (em.employeeExists(empl)) {
                        System.out.println("Employee exists: " + empl);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 3:
                    em.displayAllEmployees();
                    break;
                case 4:
                    System.out.println("Exiting Program");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}
