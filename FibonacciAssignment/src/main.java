
public class main {
	
	//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377 List of first few numbers for reference
	
	public static int fib_iteratively(int n) {
		
		if(n <= 1) {		// Ignore 0 and 1 as values
			return n;
		}
		
		int fib = 1;		// First number
		int prev_fib = 1;	// Second number
			
		for (int i = 2; i < n; i++) {	// Starting at 2 because 0 and 1 are hard-coded outside the loop
			int temp = fib;				// Creating temp number to use as later assignment
			fib += prev_fib;			// Adding the two numbers and changing fib to new number
			prev_fib = temp;			// Using temp number to update prev_fib
		}
		
		System.out.println(fib);		// Print to visualize
		return fib;
	}
	
	public static int fib_recursively(int n) {
	    if (n <= 1) {	// Ignore 0 and 1 as values
	        return n;
	    }
	    
	    return fib_recursively(n - 1) + fib_recursively(n - 2);
	    // This code essentially works backwards until it reaches the base case of 1
	    // If we want fib_rec(5), it must first find fib_rec(4) - fib_rec(3) and so on...
	    // Once it gets to the base case, it works it's way back up the call stack to our original number
	}
	
	
	public static void main(String[] args) {
		
		// Iterative
		long iterStartTime = System.nanoTime();	// Start Timer
		fib_iteratively(28);					// Run Function
		long iterEndTime = System.nanoTime();	// End Timer
		long totalIterTime = iterStartTime - iterEndTime;	// Calculate Total Iterative Time
		
		// Recursive
		long recStartTime = System.nanoTime();	// Start Timer
		int value = fib_recursively(28);		// Run Function
		long recEndTime = System.nanoTime();	// End Timer
		long totalRecTime = recStartTime - recEndTime; // Calculate Total Recursive Time
		System.out.println(value);
		
		// Time efficiencies of each function
		System.out.println("Recursive time: " + Math.abs(totalRecTime) + " nanoseconds");	// Need math.abs because of integer overflow
		System.out.println("Iterative time: " + Math.abs(totalIterTime) + " nanoseconds");
		
		// Both functions print "317811" (The 28th value in the Fibonacci sequence)
	}

}
