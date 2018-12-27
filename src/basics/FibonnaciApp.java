package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fibonnaci number is defined by the sum of the 2 previous fibonnaci numbers.
		// fib (0) = 0
		// fib(1) = 1
		// fib(2) = fib(0) + fib(1)
		System.out.println(fib(10));
		
	}
	
	// Recursion
	public static int fib(int n) {
		if (n == 0 ) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		return (fib(n-1) + fib(n-2));
	}

}
