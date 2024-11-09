
package dsa_lab;
import java.util.*;

class Employee {
    private String name;
    private int id;

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Override hashCode and equals
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Employee employee = (Employee) obj;
        return id == employee.id && name.equals(employee.name);
    }

    // toString method to display employee details
    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + "}";
    }
}
class EmployeeManagement {
    private HashSet<Employee> employeeSet;

    // Constructor
    public EmployeeManagement() {
        employeeSet = new HashSet<>();
    }

    // Add a new employee to the records
    public boolean addEmployee(Employee employee) {
        if (employeeSet.contains(employee)) {
            System.out.println("Employee already exists: " + employee);
            return false;
        } else {
            employeeSet.add(employee);
            System.out.println("Employee added: " + employee);
            return true;
        }
    }

    // Check if an employee already exists
    public boolean employeeExists(Employee employee) {
        return employeeSet.contains(employee);
    }

    // Display all employees
    public void displayAllEmployees() {
        if (employeeSet.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            System.out.println("Employee Records:");
            for (Employee emp : employeeSet) {
                System.out.println(emp);
            }
        }
    }
    
}
/*
 class Color {
    private int red;
    private int green;
    private int blue;

    // Constructor
    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    // Getters
    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    // Override hashCode to include red, green, and blue values
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + red;
        result = 31 * result + green;
        result = 31 * result + blue;
        return result;
    }

    // Override equals to compare RGB values
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // same reference
        if (obj == null || getClass() != obj.getClass()) return false;  // null or different class

        Color color = (Color) obj;
        return red == color.red && green == color.green && blue == color.blue;
    }

    // toString method to display color details
    @Override
    public String toString() {
        return "Color{red=" + red + ", green=" + green + ", blue=" + blue + "}";
    }

    // Main method to test the class
    public static void main(String[] args) {
        Color color1 = new Color(255, 0, 0); // Red color
        Color color2 = new Color(255, 0, 0); // Another red color
        Color color3 = new Color(0, 255, 0); // Green color

        System.out.println("color1 equals color2: " + color1.equals(color2)); // true
        System.out.println("color1 equals color3: " + color1.equals(color3)); // false

        System.out.println("color1 hashCode: " + color1.hashCode());
        System.out.println("color2 hashCode: " + color2.hashCode());
        System.out.println("color3 hashCode: " + color3.hashCode());
    }
}
*/
public class Dsa_Lab2_HomeT {
   /* public static void main(String[] agrs){
        /*Vector<Integer> vect=new Vector<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 integers: ");
        //Adding Integer
        for(int i=0;i<10;i++){
            vect.add(sc.nextInt());
        }
        System.out.print("\nVector: ");
        for(int i:vect){
            System.out.print(i+" ");
        }
        System.out.print("\nSorted Vector: ");
        Collections.sort(vect);
        for(int i:vect){
            System.out.print(i+" ");
        }
        //Since Vector is Sorted
        System.out.print("\nLargest Integer: ");
        System.out.println(vect.getLast());
        
        System.out.print("Smallest Integer: ");
        System.out.println(vect.getFirst());
        
        
        
        //Task#2
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to get its hash code (or type 'exit' to quit): ");
        String input = scanner.nextLine();

        while (!input.equalsIgnoreCase("exit")) {
            int hashCode = input.hashCode();
            System.out.println("Hash code of \"" + input + "\": " + hashCode);

            System.out.print("Enter another string (or type 'exit' to quit): ");
            input = scanner.nextLine();
        }

        System.out.println("Program exited.");
        scanner.close();
        
        
        //Task3
        
    } */
 
   public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Employee");
            System.out.println("2. Check if Employee Exists");
            System.out.println("3. Display All Employees");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter employee ID: ");
                    int id = scanner.nextInt();
                    Employee emp = new Employee(name, id);
                    employeeManagement.addEmployee(emp);
                    break;
                case 2:
                    System.out.print("Enter employee name to check: ");
                    String checkName = scanner.nextLine();
                    System.out.print("Enter employee ID to check: ");
                    int checkId = scanner.nextInt();
                    Employee checkEmp = new Employee(checkName, checkId);
                    if (employeeManagement.employeeExists(checkEmp)) {
                        System.out.println("Employee exists: " + checkEmp);
                    } else {
                        System.out.println("Employee does not exist.");
                    }
                    break;
                case 3:
                    employeeManagement.displayAllEmployees();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    } 
}
