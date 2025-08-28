package iuh.fit.se;
import java.util.Scanner;

public class TestRectangle {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter length: ");
			double length = sc.nextDouble();
			System.out.print("Enter width: ");
			double width = sc.nextDouble();
			Rectangle rect = new Rectangle (length, width);
			System.out.println(rect.toString());
		} catch (Exception e) {
			System.out.println("Error: " +e.getMessage());
		}
		sc.close();
	}
}


/**
 * @description OOP-Object-Oriented Programming
 * @author Le Khai Minh
 * @version 1.0
 * @created Aug 27, 202511:53:53 PM
 */