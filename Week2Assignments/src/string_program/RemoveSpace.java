package string_program;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string :");
		String string = scanner.nextLine();
		System.out.println("Space is replaced with a special character : "+string.replace(" ", "@"));
		System.out.println("Space removed : "+string.replace(" ", ""));
		scanner.close();

	}

}
