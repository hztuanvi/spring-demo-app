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
public class ArraySort {
     
     //sắp xếp mảng theo chiều tăng dần.
    public static void sort(int[] array){
    for (int i = 0; i <array.length; i++) {
             for (int j=i+1; j <array.length; j++) 
                 if(array[i]>array[j])
                 {
                   int t=array[i];
                   array[i]=array[j];
                   array[j]=t;
                 }
             
         }    
    }
    //in ra màn hình.
    public static void output(int[] array){
       System.out.println("ArraySort");
         for (int i = 0; i <array.length; i++) {
             System.out.print(" "+array[i]); 
         } 
    }
    static Scanner input = new Scanner(System.in);  
    public static void main(String[] args) {    
        System.out.println("Nhap so phan tu trong mang:");
        int n = input.nextInt();               
        int [] array = new int [n];
        System.out.print("Nhap cac phan tu trong mang: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            array[i] = input.nextInt();
        }       
       sort(array);
       output(array);        
     }
     
    
}
