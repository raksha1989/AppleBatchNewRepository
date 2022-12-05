import java.util.Scanner;
//import packagename.classname;

public class IfElseIfExampleVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch;
		System.out.println("Enter a character: ");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);

		if (ch == 'A' || ch == 'a')

			System.out.println("Vowel");

		else if (ch == 'E' || ch == 'e')

			System.out.println("Vowel");

		else if (ch == 'I' || ch == 'i')

			System.out.println("Vowel");

		else if (ch == 'O' || ch == 'o')

			System.out.println("Vowel");
		// System.out.println("O is vowel");

		else if (ch == 'u' || ch == 'U')

			System.out.println("Vowel");

		else {
			System.out.println("Consonant");
			System.out.println("please enter a vowel character");
		}
		sc.close();

	}

}
