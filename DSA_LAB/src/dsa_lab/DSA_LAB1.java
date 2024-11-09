/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa_lab;

/**
 *
 * @author HP
 */
public class DSA_LAB1 {

    public static void main(String[] args) {
       /*/**Task #1**
        //Using Literals
        String a="Hassan Junaid";
        String b= "Under Graduate";
        //Using New Keyword
        String c=new String("Software Engineering");
        String d=new String("Batch 2023");
        //Using Intern
        String e =new String("3rd Semester").intern();
        
        
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
        System.out.println("d:"+d);
        System.out.println("e:"+e);
        
        // Demonstrating immutability
        String var = "Java";
        System.out.println("\nOriginal String: " + var);

        // Trying to modify the string
        String modified = var.replace('J', 'K');
        System.out.println("After replace operation (var): " + modified);
        System.out.println("Original String remains unchanged: " + var);
    
       */
       /*
        
        //Task 2
        double var=908;
        //Conversion
        Double var1=var;
        System.out.println("Wrapper class(autoboxed):"+var1);*/
       
       //*Task3*
       //Initialize String
       /*String s1="Atif";
       String s2="Hassan";
       String s3="Jameel";
       String s4="Yamin";
       String s5="Basil";
       
       //Concantate
       String con1=s1.concat(" "+s2);
       String con2=s2.concat(" "+s3);
       String con3=(s3+" "+s4);
       String con4=(s4+" "+s5);
       String con5=s5.concat(" Haris");
       
       
       System.out.println("Concantate s1 and s2: "+con1);
       System.out.println("Concantate s2 and s3: "+con2);
       System.out.println("Concantate s3 and s4: "+con3);
       System.out.println("Concantate s4 and s5: "+con4);
       System.out.println("Concantate s5 and s1: "+con5);
       
       //Fourth String Conversion
       String upper =s4.toUpperCase();
       System.out.println("\nFourth String: "+s4+"\nUpper Case: "+upper);
       
       //SubString from index 8
       System.out.println("\nSubstring con1: "+con1.substring(8));
       System.out.println("Substring con2: "+con2.substring(8));
       System.out.println("Substring con3: "+con3.substring(8));
       System.out.println("Substring con4: "+con4.substring(8));
       System.out.println("Substring con5: "+con5.substring(8));
       */
       
       /*//Task 4
       String word1="Hmla";
       String word2="iai";
       
       System.out.println("Word1: "+word1+"\nWord2: "+word2+"\nMerged Words: "+merged(word1,word2));
       */
       
       //Task 5
       //Integer
       System.out.println("Max Integer:"+Integer.MAX_VALUE);
       System.out.println("Min Integer:"+Integer.MIN_VALUE);
       //FLoat
       System.out.println("\nMax Float:"+Float.MAX_VALUE);
       System.out.println("Min Float:"+Float.MIN_VALUE);
       //Double
       System.out.println("\nMax Double:"+Double.MAX_VALUE);
       System.out.println("Min Double:"+Double.MIN_VALUE);
    }
   /* public static String  merged(String a,String b){
        String m="";
        int maxlength=Math.max(a.length(), b.length());
        for(int i=0;i<maxlength;i++){
           if(i<a.length()){
               m+=a.charAt(i);
           }
           if(i<b.length()){
               m+=b.charAt(i);
           }
        }
        return m;
        
    }*/
    
}
