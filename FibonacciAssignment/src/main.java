
public class main {
	
	public static int fib_iteratively(int n) {
		
		if(n <= 1) {
			return n;
		}
		
		int fib = 1;
		int prev_fib = 1;
			
		for (int i = 2; i < n; i++) {
			int temp = fib;
			fib += prev_fib;
			prev_fib = temp;
		}
		
		System.out.println(fib);
		return fib;
	}
	
	//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377,
	
	public static int fib_recursively(int n) {
	    if (n <= 1) {
	        return n;
	    }
	    return fib_recursively(n - 1) + fib_recursively(n - 2);
	}
	
	
	public static void main(String[] args) {
		
		// Iterative
		fib_iteratively(28);
		
		// Recursive
		int value = fib_recursively(28);
		System.out.println(value);
		
		
		// Both functions print "317811" (The 28th value in the Fibonacci sequence)
	}

}
