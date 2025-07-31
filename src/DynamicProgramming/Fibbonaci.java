package DynamicProgramming;

public class Fibbonaci {

	public static int fib(int n) {
		int fib[]=new int[n+1];
		fib[0]=0;
		fib[1]=1;
		if(n==0 || n==1) {
			return n;
		}
		for(int i=2;i<=n;i++) {
			fib[i]=fib[i-1]+fib[i-2];
		}
		return fib[n];
	}
	public static int fib1(int n) {
		
		int prev=0;
		int curr=1;
		int next=0;
		if(n==0 || n==1) {
			return n;
		}
		for(int i=2;i<=n;i++) {
			next=prev+curr;
			prev=curr;
			curr=next;
			
		}
		return next;
	}
	
}
