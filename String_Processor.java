/*
String Processor with Exception Safety

Create a program that:

Takes a string input

Performs:

substring operation
charAt operation
Requirements:

Handle:

StringIndexOutOfBoundsException
Example:
Invalid index handled safely
*/

import java.util.Scanner;
import java.lang.StringIndexOutOfBoundsException;
public class STRING_PROCESSOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String string = sc.nextLine();
		try {
			System.out.println("Enter the index bounds for the substring:");
			System.out.print("Start: ");
			int a = sc.nextInt();
			System.out.print("End: ");
			int b = sc.nextInt();
			
			System.out.println("Substring: "+string.substring(a,b));
			
			System.out.println("Enter the character to access of string");
			System.out.print("Enter index: ");
			a = sc.nextInt();
			System.out.println("Character at index "+a+" is: "+string.charAt(a));
		}catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Invalid index handled safely");
		}
		sc.close();
	}

}
