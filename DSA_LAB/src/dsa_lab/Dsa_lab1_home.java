
package dsa_lab;

public class Dsa_lab1_home {
    public static void main(String[] args){
      /*//initialize double value
      double no=-439.05;
      //Autoboxing
      Double number =no;
      System.out.println("Absolute vlaue of"+no+"is: "+Math.abs(number));
      System.out.println("Square Root of"+no+"is: "+Math.sqrt(number));
      System.out.println("2th Power of"+no+"is: "+Math.pow(number,2));
      //Unboxing
      double no1=number;
      System.out.println(no1);*/
      
    /*int value=596;
    //Autoboxing
    Integer val=value;
    //Using Methods
    //Conversion String into Integer
    String a="12345";
    Integer b=Integer.valueOf(a);
    System.out.println(b+6);
    //Convert Integer to int
    double c=new Integer(b).doubleValue();
    System.out.println(c);
    //Convert to String
    String str=b.toString();
    System.out.println(str+" "+str);
    Double d=Double.valueOf("NaN");
    //Chk if value is Not a number (NaN)
    boolean bl=d.isNaN();
    System.out.println(bl);
    
    Double e=Double.valueOf("Infinity");
    //Chk if value is Infinite
    boolean ch=e.isInfinite();
    System.out.println(ch);
    
    //Convert to hashCode
    System.out.println(b.hashCode());*/
    
    /*int ceven=0;
    int codd=0;
    int i1 = 1234789080;
        
        // Autoboxing: converting primitive int to Integer
        Integer i2 = i1;
        
        // Convert Integer to String
        String s = String.valueOf(i2);
        
        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            int o = Character.getNumericValue(s.charAt(i)); // Get numeric value of each character
            if (o % 2 == 0) {
                ceven++; // Count even digits
            } else {
                codd++; // Count odd digits
            }
        }
        
        // Display the count of even and odd digits
        System.out.println("Even No: " + ceven);
        System.out.println("Odd No: " + codd);
        
        // Unboxing: converting Integer back to primitive int
        int i3 = i2;
        System.out.println("Unboxed: " + i3);*/
        
    
    
    
    /*
        int count = 0;
        String vowels = "aeiouAEIOU";
        String str1 = "Jamal Khurram";
        String addedVowel = "";

        // Iterate through the characters of str1
        for (int i = 0; i < str1.length(); i++) {
            String str2 = String.valueOf(str1.charAt(i));
            // Check if the current character is a vowel
            if (vowels.contains(str2)) {
                count = count + 1;
                addedVowel = addedVowel.concat(str2);
            }
        }
        //To reverse the addedVowel string
        StringBuilder sb = new StringBuilder(addedVowel);
        String reversedVowel = sb.reverse().toString();

        System.out.println("Reversed Vowels: " + reversedVowel);*/
     
        String sentence ="Jawa is vast used Programming Language";
        String[] arr=sentence.split(" ");
        
        String longest="";
        int length=0;
        
        for(int i =0;i<arr.length;i++){
            if(arr[i].length()>length){
                length=arr[i].length();
                longest=arr[i];
            }
        }
        System.out.println("Longest String: "+ longest);
    
    
    }
}
