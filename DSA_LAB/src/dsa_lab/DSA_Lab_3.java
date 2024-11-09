
package dsa_lab;

import java.util.*;


public class DSA_Lab_3 {
    public static void main(String[] args){
        /*Scanner sc=new Scanner(System.in);
        System.out.print("Enter Value to print Descending Sequence: ");
        int k =sc.nextInt();
        kToZero(k);
        System.out.println();
        sc.close();*/
        
        
        /*Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Full Name: ");
        String j =sc.nextLine();
        reverse(j);
        System.out.println();*/
        
        
        /*Scanner sc=new Scanner(System.in);
        System.out.print("Enter Value of N to get its sum from 1: ");
        int N =sc.nextInt();
        int n=1;
        System.out.println("Sum is:"+sumOneToN(n, N));
        System.out.println();
        sc.close();*/
       
        /*int[] ar={1,5,7,45,12};
        int sum=sumArray(ar,ar.length);
        System.out.println("Sum of Array: "+sum);*/
        
        /*Scanner sc=new Scanner(System.in);
        System.out.print("Enter Value of int to get its Factorial: ");
        int no =sc.nextInt();
        System.out.println(fact(no));*/
        
        /*int num=521391;
        System.out.println("Digit Count: "+countDigit(num));*/
        
    Scanner sc=new Scanner(System.in);
        System.out.println("Provide 2 numbers to get there gcd:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("gcd("+n1+","+n2+"): "+gcd(n1,n2));
 
         
        String pl="BoB";
        System.out.println(pl+" is palindrome: "+palinDrome(pl));
        
 
        Map<Integer,Integer> meHash=new HashMap<>();
    }
    public static void kToZero(int k){
        if(k<0){
            return;
        }else{
            System.out.print( k +" ");
            kToZero(k-1);
        }
    }
    public static void reverse(String s){
       if(s.isEmpty()){
           return;
       }else{
           reverse(s.substring(1));
           System.out.print(s.charAt(0));
       }
        
    }
    public static int sumOneToN(int n,int N){
        if(n==N){
            return n;
        }else{
            return n+sumOneToN(n+1,N);
        }
    }
    public static int sumArray(int[] ary,int length){
        if(length<=0){
            return 0;
        }else{
           return  ary[length-1]+sumArray(ary,length-1);
        }
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
    public static int countDigit(int n){
        if(n<=0){
            return 0;
        }else{
            return 1+countDigit(n/10);//As it is int so last no become decimal which will be explited
        }
    }
    public static String palinDrome(String p){
        if(p.length()<=1) {
            return "Yes";
        }
        if(p.charAt(0)==p.charAt(p.length() -1)){
           return palinDrome(p.substring(1, p.length() - 1));
        } else{
            return "No";
        }
        
    }
    
    public static int gcd(int n,int n1){
        int max= Math.max(n, n1);
        int min= Math.min(n, n1);
        if(min==0){
            return max;
        }
        int temp=min;
        min=max%temp;
        max=temp;
        return (gcd(max,min));
        
    }
       
}
