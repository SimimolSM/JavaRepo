package conversions;

import java.util.Arrays;
import java.util.Scanner;

public class StringToChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String :");
		String string = scanner.nextLine();
		scanner.close();
        char [] char2 = string.toCharArray();
        System.out.println("String '"+string+"' to character is :"+Arrays.toString(char2));
	}

}
