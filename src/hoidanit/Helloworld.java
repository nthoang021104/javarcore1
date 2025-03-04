package hoidanit;

import java.util.Scanner;

public class Helloworld {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ten ");
		String a = scanner.nextLine();
		System.out.println("Tuoi: ");
		int b = scanner.nextInt();
		System.out.println("T en:" + a + ", Tuoi:" + b);
		scanner.close();
	}
}
