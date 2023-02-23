import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_16214 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int testCase = Integer.parseInt(str);
        //BigInteger[] ans = new BigInteger[10];
        int[] ans = new int[100];

        for(int i = 0 ; i < testCase; i ++ ){
            String str2 = br.readLine();
            StringTokenizer st2 = new StringTokenizer(str2," ");
          
            int N = Integer.parseInt(st2.nextToken());
            int M = Integer.parseInt(st2.nextToken());
         
            double result;
            double exponent = N;
      
            for(int j = 1; j <  100; j ++ ){
                
                //BigInteger powResult = N.pow(test);
                result = Math.pow(N, exponent);
                ans[j] = (int) (result%M); 
                exponent = Math.pow(exponent, N);
                System.out.println(exponent);
               
               

            }
            
        }
        //System.out.println(Arrays.toString(ans));

    }
    
}
