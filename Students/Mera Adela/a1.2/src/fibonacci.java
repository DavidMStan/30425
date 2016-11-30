
public class fibonacci {
	
	public static long sumFibonacci (int n){
		long sum = 0;
	    long fib = 0;
	    long f1 = 1;
	    long f2 = 2;
	    if (n==1){
	    	return 0;
	    }
	    if (n==2){
	    	return f2;
	    }
	    for (int i = 1; i <= n-2; i++) {
	        fib = f1 + f2;
	        f1 = f2;
	        f2 = fib;
	        if(fib %2 ==0)
	            sum += fib;         
	    }
	    return sum+2;
	}
	
	public static void main(String[] args){
		int n=3;
		long result = sumFibonacci(n);
	    System.out.println("The sum of the even Fibonacci numbers is: "+result);
		
	}
	
	
}
