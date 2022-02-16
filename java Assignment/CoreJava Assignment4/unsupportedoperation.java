package javaAssignment;
import java.util.*;

public class unsupportedoperation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c = 0;
		try {
			if(b==0) {
				throw new UnsupportedOperationException();
			}
            c=a/b;
    		System.out.println(a+"/"+b+"="+c);

		}
		catch(UnsupportedOperationException ex) {
			System.out.println("Unsupported Operation Exception occured. Divident cannot be zero.");

		}

	}

}


