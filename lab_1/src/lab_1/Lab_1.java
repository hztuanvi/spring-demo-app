/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Lab_1 {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nhap so phan tu trong mang:");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.print("Nhap cac phan tu trong mang: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            array[i] = input.nextInt();
        }
        //in
        printArray(array);
        System.out.println("\n");
        System.out.println("\n");
        Menu(array);
    }

    /**
     *
     * @param array Menu
     */
    public static void Menu(int[] array) {
        int choice;
        do {
            System.out.println("1. Xóa phần tử trùng.");
            System.out.println("2. Tìm vị trí của số");
            System.out.println("3. Đảo ngược danh sách.");
            System.out.println("4. Thay thế phần tử.");
            System.out.println("5. Đếm số lần xuất hiện.");
            System.out.println("moi nhap:");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    deleteDuplicateElements(array);
                    System.out.println("\n");
                    break;
                case 2:
                    findLocation(array);
                    //timvitri(array);
                    System.out.println("\n");
                    break;

                case 3:
                    System.out.println("\n");
                    reverseArray(array);

                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("\n");
                    replaceArray(array);
                    System.out.println("\n");
                    break;
                case 5:
                    System.out.println("\n");

                    countNumberOccurrences(array);
                    System.out.println("\n");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (choice != 5);
    }

    /**
     *
     * @param array In ra màn hình mảng vừa nhập.
     */
    public static void printArray(int[] array) {
        System.out.println("Print Array :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }

    /**
     *
     * Xóa phần tử trùng nhau trong mảng.
     *
     */
    public static void deleteDuplicateElements(int[] array) {
        int n = array.length;
        int[] arr = new int[n];
        boolean tim;
        int count = 0;
        arr[0] = array[0];
        count++;

        for (int i = 1; i < array.length; i++) {
            tim = false;
            for (int j = 0; j < count; j++) {
                if (arr[j] == array[i]) {
                    tim = true;
                    break;
                }
            }
            if (!tim) {
                arr[count] = array[i];
                count++;
            }
        }

        array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = arr[i];
        }

        System.out.println("Mảng sau khi xóa phần tử trùng nhau:");
        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    /**
     *
     * Đảo ngược mảng.
     */

    public static void reverseArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    ///tìm vị trí của một số.
    public static void findLocation(int[] array) {
        int count = 0;
        int i;
        System.out.println("Nhập số cần tìm:");
        int n = input.nextInt();

        for (i = 0; i < array.length; i++) {
            if (n == array[i]) {
                count = 1;
                System.out.println("Vị trí của " + n + " là: " + i);
            }
        }
        if (count != 1) {
            System.out.println("ko tìm thấy số: " + n);
        }
    }

    // thay thế phần tử trong mảng.
    public static void replaceArray(int[] array) {
        System.out.println("Nhập số cần thay thế:");
        int n = input.nextInt();
        System.out.println("Nhập số được thay thế:");
        int a = input.nextInt();
        System.out.println("----------");
        System.out.println("Mảng sau khi được thay thế:");
        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) {
                array[i] = a;
            }
            System.out.println(array[i]);
        }
    }

    //Đếm số lần xuất hiện của các phần tử trong mảng.
    public static void countNumberOccurrences(int[] array) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            if (!list.contains(array[i])) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                    }
                }
                System.out.println(array[i] + " xuất hiện " + count + " lan");
                list.add(array[i]);
            }
        }
    }
}
