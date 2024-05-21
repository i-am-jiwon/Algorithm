import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] arr = input.split(" ");
		double d1 = Double.parseDouble(arr[0]);
		double d2 = Double.parseDouble(arr[1]);
		double answer = (7*d1 / (d1+d2));
		answer = Math.floor(answer * 100) / 100.0;
		System.out.printf("%.2f",answer);
	}
}