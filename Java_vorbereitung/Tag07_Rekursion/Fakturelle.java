package demo.kurs;

public class Fakturelle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long fact = 1;

		for (int i = 1; i <= 10; i++) {
			fact = fact * i;
		}

		System.out.println(fact);
		
		fact = facturelle(10);
		System.out.println(fact);

	}
// n!=1⋅2⋅3⋅...⋅(n−2)⋅(n−1)⋅n
// n! = n * (n-1)!
// fact(n) = n * fact(n-1)
// fact(0) = 1
// fact(1) = 1
	
// fib(n) = fib(n-1) + fib(n-2)
// fib(1) = 1;
// fib(0) = 1;	
	

	private static long facturelle(int n) {
		if(n==0 || n == 1) {
			return 1;
		}
		return n * facturelle(n-1);
	}

}
