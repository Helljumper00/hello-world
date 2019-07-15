package at.helloworld;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int digit = 0;
		int letter = 0;
		int space = 0;

		while (true) {
			System.out.println("Enter something");

			String s = in.nextLine();
			char[] cArray = s.toCharArray();
			System.out.println("You entered: " + s);

			for (int i = 0; i < cArray.length; i++) {

				if (Character.isDigit(cArray[i])) {
					digit++;

				} else if (Character.isLetter(cArray[i])) {
					letter++;

				} else if (Character.isWhitespace(cArray[i])) {
					space++;
				}

			}
			System.out.println(
					"In that String were: " + letter + " letters, " + digit + " numbers and " + space + " Space");
			digit=0;
			letter=0;
			space=0;

		}
	}

}
