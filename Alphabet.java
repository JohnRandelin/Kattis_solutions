import java.util.Scanner;
import java.lang.Math;

public class Alphabet {

	public static void main(String[] args) {

		float count = 0;
		float whitespace = 0;
		float lowercase = 0;
		float uppercase = 0;
		float symbols = 0;
		String input;

		Scanner str = new Scanner(System.in);

		input = str.nextLine();

		// Need to count how many characters are in the string

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ' ') {
				count++;
			}
		}
		for (int a = 0; a < input.length(); a++) {
			if (input.charAt(a) == 95) {
				whitespace++;
			}
			if (input.charAt(a) < 123 && input.charAt(a) > 96) {
				lowercase++;

			}
			if (input.charAt(a) < 91 && input.charAt(a) > 64) {
				uppercase++;
			} else {
				symbols++;
			}
		}
		System.out.println(whitespace / count);
		System.out.println(lowercase / count);
		System.out.println(uppercase / count);
		System.out.println((symbols - lowercase - whitespace) / count);
	}

}
