import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int n = sc.nextInt();
		int ans = 0;
        
		for(int i=0; i<=50; i++)
				for(int j=0; j<=50; j++)
						for(int k=0; k<=50; k++)
								if((a*i) + (b*j) + (c*k) == n)
										ans=1;

		System.out.println(ans);
	}
}