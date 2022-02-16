package javaAssignment;
import java.util.*;

public class ArithemeticException1 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int x=input.nextInt();
		int y=input.nextInt();
        try {
            System.out.println(x / y); // throw Exception
        }
        catch (ArithmeticException e) {
            // Exception handler
            System.out.println("Divided by zero operation cannot be possible");
        }
        
	}
	


}
