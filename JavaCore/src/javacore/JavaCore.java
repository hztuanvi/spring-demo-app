package javacore;

import java.util.Scanner;

/**
 * Tap hop cac xu ly lien quan den java core
 * 
 * @author TrangPT
 *
 */
public class JavaCore {

	public static void main(String[] args) {
		float a, b, c;
		Scanner sCInput = new Scanner(System.in);
		
		System.out.println("Phuong trinh bac hai:");
		
		System.out.println("Nhap a=");
		a = sCInput.nextFloat();
		
		System.out.println("Nhap b=");
		b = sCInput.nextFloat();
		
		System.out.println("Nhap c=");
		c = sCInput.nextFloat();
		
		ptb2(a, b, c);
		
		// Close scanner
		sCInput.close();
	}

	/**
	 * Tinh phuong trinh bac 2
	 * @param a so a
	 * @param b so b
	 * @param c so c
	 */
	static void ptb2(float a, float b, float c) {
		float x1, x2, del;
		
		del = b * b + 4 * a * c;
		if (del <= 0) {
			System.out.println("PT vo nghiem.");
		}
		else if (del == 0) {
			System.out.println("pt co nhiem kep:");
			x1 = -b / 2 * a;
			System.out.print("x = " + x1);
		} else {
			x1 = (float) ((-b + Math.sqrt(del)) / (2 * a));
			x2 = (float) ((-b - Math.sqrt(del)) / (2 * a));
			System.out.println("PT co 2 nghiem.");
			System.out.println("x1= " + x1);
			System.out.println("x2= " + x2);
		}
	}
}
