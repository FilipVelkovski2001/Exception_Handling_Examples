package TryCatch;


import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {

	public static void main(String[] args) {
			
		//Example 1: Handling a Array Index Out Of Bounds Exception
		
		int a[] = {123, 312, 12};
		
		try {
			System.out.println(a[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(e);
		}
		
		//Example 2: Handling a Type Mismatch Exception
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Whats your fav number?");
		
		try {
			int n = scan.nextInt();
		
		System.out.println(n);
		}catch(InputMismatchException message) {
			System.err.println(message);
		}
		
		//Example 3: Handling Null Pointer Exception
		int b[] = null;
		try {
			System.out.println(b[1]);
		}catch(NullPointerException e) {
			System.err.println(e);
		}
		
	
		
		
}
}
