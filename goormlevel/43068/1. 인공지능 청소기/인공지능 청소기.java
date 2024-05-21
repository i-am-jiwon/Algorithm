import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			int sum = Math.abs(a) + Math.abs(b);
			int diff = c - sum;

			if(diff>= 0 && diff%2 == 0) System.out.println("YES");
			else System.out.println("NO");

		}
		
	}
}