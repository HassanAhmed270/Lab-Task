package dsa_lab;
import java.util.*;

public class Dsa_Lab5_Home {
    public static void main(String[] args){
       /* double array[] = new double[7];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            System.out.print("Enter Real No: ");
            array[i] = sc.nextDouble();
        }
        realFunc(array);*/

        int[] ary = {1,23,3,52,76};
        
        zSort(ary);
        
        // Print the zigzag pattern array
        System.out.println("Zigzag pattern array:");
        for (int num : ary) {
            System.out.print(num + " ");
        }System.out.println(" ");
    
       /*int[] nums = {2, 3, 6, 7,5,1,4};
        int target = 7;

        System.out.println("Combinations that sum to " + target + ":");
        findCombinations(nums, target);*/
       int[] given = {6,2,3,4,5,1,10}; // Example array
        int missed = findM(given);
        System.out.println("The missing number is: " + missed);
    }
    public static void findCombinations(int[] nums, int target) {
        Arrays.sort(nums); // Optional sorting
        int[] combination = new int[nums.length]; // Array to store current combination
        findCombinations(nums, target, 0, combination, 0);
    }

    private static void findCombinations(int[] nums, int target, int start, int[] combination, int pos) {
        if (target == 0) {
            // Print the valid combination
            for (int i = 0; i < pos; i++) {
                System.out.print(combination[i] + " ");
            }
            System.out.println();
            return;
        }
        
        for (int i = start; i < nums.length; i++) {
            if (nums[i] > target) break; // Stop if number is greater than remaining target
            combination[pos] = nums[i]; // Add number to combination array
            findCombinations(nums, target - nums[i], i + 1, combination, pos + 1); // Recursion when target reduced
        }
    }

    
    /*public static void realFunc(double arr[]){
        double sum = 0;
        double mean = 0;
        int count = arr.length;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        mean = sum / count;
        System.out.println("Sum is: " + sum);
        System.out.println("Mean is: " + mean);
    }*/
    public static int findM(int[] no) {
        int n = no.length;
        
        //Expected sum from 0 to n
        int expSum = n * (n + 1) / 2;//
        System.out.println("Expected Sum: "+expSum);
        //Actual Sum
        int actSum = 0;
        for (int e : no) {
            actSum += e;
        }
        System.out.println("Actual Sum: "+actSum);
        return expSum - actSum;
    }
    public static void zSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (i % 2 == 0) {
                if (array[i] > array[i + 1]) {
                    int store = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] =store;
                }
            } else {
                if (array[i] < array[i + 1]) {
                    int store = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = store;
                }
            }
        }
    }
}

class DSA_Lab5 {
    private int[] existing;
    private int k;

    public DSA_Lab5(int[] existingArray, int k) {
        this.existing = existingArray;
        this.k = k;
    }

    public int[][] split() {
        int index = -1;
        
        // Find index of element 'k'
        for (int i = 0; i < existing.length; i++) {
            if(existing[i] == k) {
                index = i;
                break;
            }
        }
        
        // If element is found, split the array
        if (index != -1) {
            int[] firstPart = Arrays.copyOfRange(existing, 0, index);
            int[] secondPart = Arrays.copyOfRange(existing, index , existing.length);
            return new int[][] { firstPart, secondPart };
        } else {
            System.out.println("Element " + k + " not found in the array.");
            return new int[][] { existing, new int[0] }; // Return original array and an empty array if 'k' is not found
        }
    }

    public static void main(String[] args) {
        int[] fArray = {94, 100, 110, 117,98,131,23,4,53,24,3};
        int k = 110;
        DSA_Lab5 splitArray = new DSA_Lab5(fArray, k);
        int[][] outputArrays = splitArray.split();

        System.out.print("Existing Array is: ");
        for (int elem : fArray) {
            System.out.print(elem + " ");
        }

        System.out.print("\nKey is: " + k);

        System.out.print("\nSecond part of Array is: ");
        for (int elem : outputArrays[1]) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
