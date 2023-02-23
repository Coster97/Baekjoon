import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class B_2407 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        BigInteger num1 = BigInteger.ONE;
        BigInteger num2 = BigInteger.ONE;
        for(int i=0; i<B; i++) {
            num1 = num1.multiply(new BigInteger(String.valueOf(A-i)));
            num2 = num2.multiply(new BigInteger(String.valueOf(i+1)));
        }
        
        System.out.println(num1.divide(num2));

    }
    
}
//빅인티저 사용해야 풀수 있는 문제임. 빅인티저 사용방법에 대한 내용 같이 정리하기