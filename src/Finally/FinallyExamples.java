package Finally;

import java.util.Scanner;

public class FinallyExamples {

	public static void main(String[] args) {

		//Handling an Arithmetic Exception using the finally keyword
		
		int a = 5;
		int b = 0;
		
		try {
			int c  = a/b;
		}catch(ArithmeticException e) {
			System.err.println( e);
		}finally {
			System.out.println("This is the keyword finally it always gets run");
		}
		
		Scanner scan = new Scanner(System.in);
		
		//Using finally to clean up the Scanner object from the memory
		
		try {
			
			System.out.println(scan.next());

		}catch(Exception e) {
			
			System.out.println(e);
			
		}finally {
			
			scan.close();
			
		}
	}
	
	


}
