/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class JavaCore {
        /**
     * @param args the command line arguments
     */
     static float x1,x2,del;
    public void ptb2(float a, float b, float c){
        
        del=b*b+4*a*c;
         if(del<=0)
             System.out.println("PT vo nghiem.");
         else
             if(del==0){
                 System.out.println("pt co nhiem kep:");
                 x1=-b/2*a;
                 System.out.println("x="+x1);
             }
         else
             {
                 x1=(float) ((-b + Math.sqrt(del))/(2*a));
                 x2=(float) ((-b - Math.sqrt(del))/(2*a));
                 System.out.println("PT co 2 nghiem.");
                 System.out.println("x1="+x1);
                 System.out.println("x2="+x2);                
             }
    }
    public static void main(String[] args) {
        float a,b,c;       
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Phuong trinh bac hai:");
         System.out.println("Nhap a=");   
         a= keyboard.nextFloat();
         System.out.println("Nhap b=");   
         b= keyboard.nextFloat();
         System.out.println("Nhap c=");   
         c= keyboard.nextFloat();   
         JavaCore trang= new JavaCore();
         trang.ptb2(a,b,c);
         
    }
    
    
}
