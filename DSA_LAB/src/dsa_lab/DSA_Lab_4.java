package dsa_lab;

import java.util.LinkedHashSet;
import java.util.Set;

public class DSA_Lab_4 {
    public static void main(String[] args) {
       /* int arr1[] = {5, 89, 23, 12};
        int arr2[] = {4, 88, 22, 11};
        
        System.out.print("Original Array1: ");
        printArray(arr1);
        
        System.out.print("Original Array2: ");
        printArray(arr2);
        
        // Swapping arrays
        swap(arr1, arr2);
        
        System.out.print("Swapped Array1: ");
        printArray(arr1);
        
        System.out.print("Swapped Array2: ");
        printArray(arr2);
        System.out.println();*/
       
       
    
       //task3
       
       
       /*String arr[]={"Hassan","Mohib","Hannah"};
       for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " is palindrome: " + isPal(arr[i]));
        }*/
   
     /* task4
     int  arr[]={9,8,0,987,1812,32,9031,1324,987};
     evenOdd(arr);
       */
     //task5
     int  arr1[]={9,8,0,987,1812,32,9031,1324,987};
     int  arr2[]={90,78,90,1812,320,31,1234,987};
     merger(arr1,arr2);
     
    }
    public static void merger(int[] ar1,int[] ar2 ){
        int temp[]=new int[ar1.length+ar2.length];
        // Copy elements from ar1 into temp
        for (int i = 0; i < ar1.length; i++) {
            temp[i] = ar1[i];
        }

        // Copy elements from ar2 into temp, starting from where ar1 left off
        for (int i = 0; i < ar2.length; i++) {
            temp[ar1.length + i] = ar2[i];
        }
        // Use a LinkedHashSet to remove duplicates and maintain insertion order
        Set<Integer> uniqueElements = new LinkedHashSet<>();
        for (int e : temp) {
            uniqueElements.add(e);
        }

        // Print merged array without duplicates
        System.out.print("Merged Array : [ ");
        for (int e : uniqueElements) {
            System.out.print(e + " ");
        }System.out.print("]");
        System.out.println();
    }
    
    public static void evenOdd(int[] ary){
        int even=0;
        int odd=0;
        for(int e: ary){
            if(e%2==0){
                even=even+1;
            }
            else{
                odd=odd+1;
            }
        }
        System.out.println("Even Nos are: "+even);
        System.out.println("Odd Nos are: "+odd);
    } 
    public static boolean isPal(String check) {
        int f = 0;
        int l = check.length() - 1;
        check = check.toLowerCase();
        
        while (f < l) {
            if(f==l){
                return true;
            }
            if (check.charAt(f) != check.charAt(l)){
                return false;
            }
            f++;
            l--;
        }
        
        return true;
    }

      
    
    public static void swap(int ar[], int ar1[]) {
        int[] temp = new int[ar.length];
        
        // Swap elements using temp array
        for (int i = 0; i < ar.length; i++) {
            temp[i] = ar[i];
            ar[i] = ar1[i];
            ar1[i] = temp[i];
        }
    }
    
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
/*
 class DSA_Lab {
    private int[] existing;
    public DSA_Lab(int[] existingArray) {
        this.existing = existingArray;
    }
    public int[] merge(int[] newArray) {
        int[] mergedArray = new int[existing.length + newArray.length];
        //from the existing array
        for (int i = 0; i < existing.length; i++) {
            mergedArray[i] = existing[i];
        }

        //from the new array
        for (int i = 0; i < newArray.length; i++) {
            mergedArray[existing.length + i] = newArray[i];
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        int[] fArray = {94, 100,110, 117};
        int[] sArray = {123, 129, 132, 140};

        DSA_Lab merger = new DSA_Lab(fArray);//Calling Existing via Constructor
        int[] outputArray = merger.merge(sArray);//Called New via Method, stored in result named array

        
        System.out.print("Existing Array is: ");
        for (int elem: fArray) {
            System.out.print(elem + " ");
        }
        System.out.print("\nNew Array is: ");
        for (int elem: sArray) {
            System.out.print(elem + " ");
        }System.out.print("\nMerged Array is: ");
        for (int elem: outputArray) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
*/