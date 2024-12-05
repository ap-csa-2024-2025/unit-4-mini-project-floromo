import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		// No need to touch anything in here
		Scanner sc = new Scanner(System.in);
		String str = null;

		System.out.println("Enter a sentence:");
		str = sc.nextLine();

		algorithm1(str);
		algorithm2(str);

		sc.close();
	}

	// This method should implement Algorithm 1 and print all neccessary data
	public static void algorithm1(String input)
	{
		String lowerCase = input.toLowerCase();
		String output = lowerCase.substring(0,1);
		String vowels = "aeiou";
		int vowelsCount = 0, repeatCount = 0, charSaved = 0;
		for (int i = 1; i < lowerCase.length(); i++) {
			String c = lowerCase.substring(i, i+1);
			String cBefore = lowerCase.substring(i-1, i);
			if (vowels.indexOf(c) != -1 && !cBefore.equals(" ")){
				vowelsCount++;
			} else if (c.equals(cBefore)){
				repeatCount++;
			} else {
				output += c;
			}

		}
		System.out.println("Algorithm 1\nVowels removed: " + vowelsCount + "\nRepeats removed: " + repeatCount + "\nAlgorithm 1 message: " + output + "\nAlgorithm 1 characters saved: " + (vowelsCount + repeatCount));
	}

	// This method should implement Algorithm 2 and print all neccessary data
	public static void algorithm2(String input)
	{
		String unique = "";
		for (int i = 1; i < input.length(); i++) {
			String c = input.substring(i, i+1);
			if (unique.indexOf(c) != -1) {

			}

		}
		System.out.println("Implement me!");
	}
}
