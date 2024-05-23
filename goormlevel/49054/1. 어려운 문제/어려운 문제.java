import java.io.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        String str = "";
        str += fac(N);
        if(N > 10) System.out.println("9");
        else{
            System.out.println(less(str));

        }

    }

    public static int less(String str){
        int answer = 0;
        if(str.length() == 1) return Integer.parseInt(str);
        else {

            String[] strArr = str.split("");
            for(int i = 0; i < strArr.length; i++){
                answer += Integer.parseInt(strArr[i]);
            }

            if(answer > 10) answer = less(""+answer);
            else return answer;
        }
        return answer;
    }

    public static long fac(int n){
        int tmp = n;
        if(n <= 1) return 1;
        while(tmp%10 == 0) {
            tmp /= 10;
        }
        return tmp*fac(n-1);
    }
}