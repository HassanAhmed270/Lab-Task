/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class DSA_Lab_2 {

    public static void main(String[] args) {
        /*ArrayList<Integer> arl=new ArrayList<Integer>();
           arl.add(1);
           arl.add(6);
           arl.add(10);
           arl.add(39);
           arl.add(0);
           
           arl.add(3,89);
           System.out.println(arl);
           for(int i=0;i<arl.size();i++){
             if(arl.get(i).equals(89)){
                 System.out.println("Index: "+i);
             }
           }
         */ 
          /* //Task #1
           Vector<Integer> vec1=new Vector<Integer>(10);
           int n=6;
           for(int i=0;i<10;i++){
               vec1.add(n);
               n=n+5;
           }
           System.out.print("Vector: ");
           System.out.print(vec1);
           
           int sum=vec1.stream().mapToInt(Integer::intValue).sum();
           System.out.println("\nSum of members: "+sum);
         */
 /*
        //Task #2 
        ArrayList<String> ar1 = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("Enter five menu  Items:");
        for (int i = 0; i < 5; i++) {
            ar1.add(sc.nextLine());
        }
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display all items");
            System.out.println("2. Display the largest item");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:

                    System.out.print("Menu Display:");
                    for (String e : ar1) {
                     System.out.println(e);
                        
                    }
                    break;
                case 2:
                    String largest = " ";
                    for (String item : ar1) {
                        if (item.length() > largest.length()) {
                            largest = item;
                        }
                    }
                    System.out.println("Largest Item: " + largest);
                    break;

                case 3:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        sc.close();*/

       /* //Task #4 
        Vector<Integer> vec2=new Vector<Integer>(10);
           //Initializing value
           int n=6;
           for(int i=0;i<10;i++){
               vec2.add(n);
               n=n+5;
           }
           System.out.print("Vector: ");
           System.out.print(vec2);
           System.out.println();
           
           //Calculate sum and max value
           int sum=0;
           int max=0;
           for(int c:vec2){
               if(c>max){
                   max=c;
               }
               sum+=c;
           }
           System.out.println("Sum is: "+sum);
           System.out.println("Max Value is: "+max);*/
       //Task #5
          /*ArrayList<Integer> ark = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter values for a Sorted ArrayList (non-integer to stop):");
        while (sc.hasNextInt()) {
            ark.add(sc.nextInt());
        }

        System.out.println("Enter k (position for k-th smallest value):");
        int k = 5;

        // Sorting ArrayList
        Collections.sort(ark);

        if (k > 0 && k <= ark.size()) {  // Adjust condition to include the last element
            int kthSmallest = ark.get(k - 1); // k-1 to access k-th element correctly
            System.out.println("The smallest of " + k + "-th value is: " + kthSmallest);
        } else {
            System.out.println("k must be between 1 and " + ark.size());
        }*/
          
        //Task #6
        ArrayList<Integer> m1=new ArrayList<Integer>();
        m1.add(20);
        m1.add(59);
        m1.add(93);
        ArrayList<Integer> m2=new ArrayList<Integer>();
        m2.add(89);
        m2.add(30);
        
        ArrayList<Integer> merged=new ArrayList<Integer>();
        merged.addAll(m1);
        merged.addAll(m2);
        
        System.out.println("1st ArrayList: "+m1);
        System.out.println("2nd ArrayList: "+m2);
        System.out.println("Merged ArrayList: "+merged);
        Collections.sort(merged);
        System.out.println( "Sorted Merged ArrayList: "+merged);
       
    }
    

}
 //Task #3 
class Employee implements Comparable<Employee> {

    private String name;
    private String gender;
    private int id;
    private int yearOfJoining;

    public Employee(int id, String name, int yearOfJoining, String gender) {
        this.name = name;
        this.gender = gender;
        this.yearOfJoining = yearOfJoining;
        this.id = id;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    @Override
    public int compareTo(Employee other) {
        // Ascending order by year of joining
        return this.yearOfJoining - other.yearOfJoining;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Gender: " + gender + ", Year of Joining: " + yearOfJoining;
    }

    // Comparator for sorting by year of joining in descending order
    public static Comparator<Employee> YearDescendingComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e2.getYearOfJoining() - e1.getYearOfJoining();
        }
    };

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(103, "Hassan", 2020, "Male"));
        employees.add(new Employee(180, "Jameel", 2024, "Male"));
        employees.add(new Employee(150, "Aisha", 2019, "Female"));
        employees.add(new Employee(80, "Zia", 2009, "Male"));

        // Sorting employees by year of joining in ascending order (Comparable)
        Collections.sort(employees);
        System.out.println("Employees sorted by year of joining (ascending):");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Sorting employees by year of joining in descending order (Comparator)
        Collections.sort(employees, Employee.YearDescendingComparator);
        System.out.println("\nEmployees sorted by year of joining (descending):");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
