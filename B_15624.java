import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class B_15624 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if(N == 0){
            System.out.println(0);
        }else if(N == 1){
            System.out.println(1);
        }else{
            BigInteger[] arr = new BigInteger[N + 1];

			arr[0] = BigInteger.ZERO;
			arr[1] = BigInteger.ONE;
            BigInteger num = new BigInteger("1000000007");
			for (int i = 2; i <= N; i++) {
				arr[i] = arr[i - 2].add(arr[i - 1]).remainder(num);
			}
     
            System.out.println(arr[N]);
    
        }   
    }    
}
