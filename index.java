import java.util.Scanner;

public class IntermediateJavaProgram {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Function 1: Conditional statement (if-else)
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        
        // Function 2: Looping (for loop)
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();
        System.out.println("Printing numbers from 1 to " + limit + ":");
        for (int i = 1; i <= limit; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Function 3: Array
        System.out.println("Enter five numbers:");
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("The numbers in reverse order are:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        // Function 4: Method
        System.out.print("Enter a string: ");
        String inputString = scanner.next();
        int stringLength = calculateStringLength(inputString);
        System.out.println("The length of the entered string is: " + stringLength);
        
        scanner.close();
    }
    
    // Function 4: Method (calculates the length of a string)
    public static int calculateStringLength(String str) {
        return str.length();
    }
}