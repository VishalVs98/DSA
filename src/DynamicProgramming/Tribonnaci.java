package DynamicProgramming;

public class Tribonnaci {
	
	public static int tib(int n) {
		
		int [] dp=new int[n];
		
		if(n==0 ||n==1 ||n==2) {
			return 0;
		}
		dp[0]=0;
		dp[1]=0;
		dp[2]=1;
		
		for(int i=3;i<n;i++) {
			dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
		}
		return dp[n-1];
	}

}
