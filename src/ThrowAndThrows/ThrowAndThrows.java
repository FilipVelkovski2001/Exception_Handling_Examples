package ThrowAndThrows;

public class ThrowAndThrows {

	//12 cannot be divided by 5, so we are going to throw an ArrithmeticException!
	
	static int a = 20;
	static int b = 5;
	static void divide() throws ArithmeticException {
		
		if(b == 5) {
			throw new ArithmeticException("Cannot divide by 5!");
		}
		else {
			int res = a/ b;
			System.out.println(res);
		}
	}
	
	public static void main(String[] args) {
		
		divide();

	}

}
