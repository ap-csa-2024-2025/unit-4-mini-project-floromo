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
		String lowIn = input.toLowerCase();
		String unique = "";
		int count = 0, uniqueCount = 0;
		for (int i = 0; i < lowIn.length(); i++) {
			String c = lowIn.substring(i, i+1);
			if (unique.indexOf(c) == -1 && !(c.equals(" "))) {
				uniqueCount++;
				for (int j = 0; j < lowIn.length(); j++) {
					if (c.equals(lowIn.substring(j, j+1))){
						count++;
					}
				}
				unique = unique + count + c;
				count = 0;
			}
		}
		int saved = input.length() - unique.length();
		if (saved <= 0) {saved = 0;}
		System.out.println("Algorithm 2\nUnique characters found: " + uniqueCount + "\nAlgorithm 2 message: " + unique + "\nAlgorithm 2 characters saved: " + saved);
	}
}
