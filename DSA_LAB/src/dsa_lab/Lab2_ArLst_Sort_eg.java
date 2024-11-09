/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {

    private String name;
    private int age;
    private int rollNo;

    public Student(int r, String n,int a) {
        name = n;
        age = a;
        rollNo = r;
    }
    public int getStudentAge(){
        return this.rollNo;
    }

    @Override
public int compareTo(Student o) {
    int compareage = ((Student) o).getStudentAge();
    return this.rollNo - compareage;
}



    @Override
    public String toString() {
        return "[ rollno=" + rollNo + ", name=" + name + ", age=" + age
                + "]";
    }

    

}
public class Lab2_ArLst_Sort_eg  {
 public static void main(String args[]){
 ArrayList<Student> arraylist = new ArrayList<Student>();
 arraylist.add(new Student(221, "Rameez", 25));
 arraylist.add(new Student(242, "Zain", 26));
 arraylist.add(new Student(211, "Aijaz", 30));
 Collections.sort(arraylist);
 for(Student str: arraylist){
System.out.println(str);
 }
 }
}

