1)Explain Java Exception hierarchy:

Throwable
ANS-The root class for all errors and exceptions in Java.
Example: Throwable t = new Throwable("Root of all exceptions");
Exception
ANS-Subclass of Throwable. Represents conditions that a program should catch and handle.
Example: IOException (occurs when input/output operations fail)
Error
ANS-Subclass of Throwable. Represents serious problems that applications should not try to handle (like JVM issues).
Example: OutOfMemoryError.

Give one example for each.


2)Can we have multiple catch blocks?
Explain with example when it is useful.
ANS-Yes, Java allows multiple catch blocks to handle different types of exceptions separately.

Example:
import java.util.Scanner;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int result = 10 / a;
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
    }
}
Useful when: Different exceptions need different handling logic.


3)A program crashes when user enters text instead of number.

What exception occurs?

How will you handle it?

Where should try-catch be placed?

ANS-InputMismatchException


By using a try-catch block to catch InputMismatchException and display an error message.

Where should try-catch be placed?
Around the code that accepts numeric input from the user.

Example:

try {
    int num = sc.nextInt();
}
catch(InputMismatchException e) {
    System.out.println("Invalid Input! Please enter a number.");
}



4)try {
    int a = 10 / 0;
    
    System.out.println("Hello");

}

catch(Exception e) {

    System.out.println("Error handled");

}

System.out.println("End");

Predict the output - 

What prints first?
-Error handled

Does program stop?
No, the exception is caught by the catch block so the program continues and prints end.



