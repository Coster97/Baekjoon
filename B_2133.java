import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2133 {

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n + 1];

        dp[1] = 0;
        dp[2] = 3;
        
        for(int i = 3; i <= n; i ++){
            dp[i] = (dp[i - 1] + dp[i - 2]);
        }
        if(n % 2 != 0){
            System.out.println(0);
        }else{
            System.out.println(dp[n]);
        }
      
    }
    
}
