package javacore;

import java.util.Scanner;

/**
 * Example about array sort
 * 
 * @author TrangPT
 *
 */
public class ArraySort {

	public static void main(String[] args) {
		Scanner sCInput = new Scanner(System.in);
		System.out.print("Nhap so phan tu trong mang: ");
		int numberOfElement = sCInput.nextInt();
		int[] array = new int[numberOfElement];
		
		System.out.print("Nhap cac phan tu trong mang:\n");
		
		for (int i = 0; i < numberOfElement; i++) {
			System.out.printf("a[%d] = ", i);
			array[i] = sCInput.nextInt();
		}
		
		sort(array);
		output(array);
		
		// Close scanner
		sCInput.close();
	}

	/**
	 * Sorts the array in ascending order
	 * @param array array to sort 
	 */
	private static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++)
				if (array[i] > array[j]) {
					int t = array[i];
					array[i] = array[j];
					array[j] = t;
				}
		}
	}

	/**
	 * Output array after sort
	 * @param array array to output
	 */
	private static void output(int[] array) {
		System.out.println("Mang sau khi sort tang dan:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
