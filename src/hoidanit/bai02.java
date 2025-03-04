package hoidanit;

import java.util.Scanner;

public class bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chieu dai:");
		int cd = scanner.nextInt();
		System.out.println("Chieu rong: ");
		int cr = scanner.nextInt();
		System.out.println("Chu vi: " + (cd + cr) * 2 + ", Dien tich:" + cd * cr + ", Canh min:" + Math.min(cd, cr));
		scanner.close();
	}
}
