import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_1149{

    static int[][] arr;
    static int[][] dp;
    static int R;
    static int G;
    static int B;
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        R = 0;
        G = 1;
        B = 2;


        arr = new int[N][3];
        dp = new int[N][3];

        for(int i = 0; i < N; i ++){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            arr[i][R] = Integer.parseInt(st.nextToken());
            arr[i][G] = Integer.parseInt(st.nextToken());
            arr[i][B] = Integer.parseInt(st.nextToken());
        }

        dp[0][R] = arr[0][R];
        dp[0][G] = arr[0][G];
        dp[0][B] = arr[0][B];

        System.out.println(Math.min(dp(N-1, R), Math.min(dp(N-1, G), dp(N-1, B))));

        
    }

    public static int dp(int n, int color){

        if(dp[n][color] == 0){
            if(color == R){
                dp[n][R] = Math.min(dp(n-1, G), dp(n-1, B)) + arr[n][R] ;                                                                                                           
            }else if(color == G){
                dp[n][G] = Math.min(dp(n-1, R), dp(n-1, B)) + arr[n][G] ;  
            }else if(color == B){
                dp[n][B] = Math.min(dp(n-1, R), dp(n-1, G)) + arr[n][B] ;  
            }
           
        }

        return dp[n][color];

    }
}