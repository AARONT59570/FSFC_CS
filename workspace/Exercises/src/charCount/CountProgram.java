package charCount;
import java.util.Scanner;

public class CountProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		System.out.print("Enter the character to count: ");
		String character = input.next().substring(0);
		String[] chars = str.split("");
		int occur = 0;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i].equalsIgnoreCase(character))
				occur++;
		}
		System.out.println(String.format("The letter %1$s occured %2$d times!", character, occur));
	}

}
