/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		int N;
        T=sc.nextInt();
       
		for(int test_case = 1; test_case <= T; test_case++)
		{
            N=sc.nextInt();  
            
        	System.out.println("#"+N);
            int[] arr = new int[N];
            String str = "";
            
            for(int i = 0; i < N; i++){
            	arr[i] = 1;   
            }
            
            for(int i = 0; i < N; i++)
            {
                str = "";
                for(int j = 0; j <= i; j++){
                    if(j == 0){
                    	str += arr[j] + " ";
                    }
                    else if(j == i){
                    	str += arr[j];
                    }
                    else{
                    	str += arr[j-1] + arr[j] + " ";
                    }
                    
                }
                System.out.print(str);

                String[] tmp = str.split(" ");
                for(int j = 0; j < tmp.length; j++){
                	arr[j] = Integer.parseInt(tmp[j]);
                }
                System.out.println();

            }

		}
	}
}