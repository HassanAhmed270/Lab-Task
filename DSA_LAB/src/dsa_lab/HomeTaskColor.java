/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab;

class Color{
    private int red;
    private int green;
    private int blue;
    public Color(int r,int g,int b ){
        red=r;
        green=g;
        blue=b;
    }
    @Override
    public int hashCode(){
        int result=31*red+31*green+31*blue;
        return result;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj)return true;
        if(obj==null||getClass()!=obj.getClass())return false;
        Color c=(Color) obj;
        return red==c.red &&green==c.green&& blue==c.blue;
    }
    @Override
    public String toString() {
        return "Color{red=" + red + ", green=" + green + ", blue=" + blue + "}";
    }
}
public class HomeTaskColor {
    public static void main(String[] args ){
        Color c1=new Color(250,0,90);
        Color c2=new Color(250,0,0);
        Color c3=new Color(250,0,0);
        
        System.out.println("c1 compare to c2:"+c1.equals(c2));
        System.out.println("c2 compare to c3:"+c2.equals(c3));
        
        System.out.println("color1 hashCode: " + c1.hashCode());
        System.out.println("color2 hashCode: " + c2.hashCode());
        System.out.println("color3 says " + c3.toString());
        
    }
}
