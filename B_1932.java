import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_1932{

    static String str;
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N+1][N+1];
        int[][] dp = new int[N+1][N+1];

        for(int i = 1 ; i <= N; i ++){
            str = br.readLine();
            if(str.length() > 1){
                StringTokenizer st = new StringTokenizer(str, " ");
                for(int j = 1; j <= N; j ++){
                   
                    if(!st.hasMoreElements()){
                        arr[i][j] = 0;
                    }else{
                        arr[i][j] = Integer.parseInt(st.nextToken());
                    }
               }
            }else{
                for(int j = 1; j <= N; j ++){
                    arr[i][1] = Integer.parseInt(str);
                    arr[i][j] = 0;
               }

            }
           
        }

        int max = 0;

        if(N ==1){
            System.out.println(str);
        }else{
            for(int i = 1 ; i <= N; i ++){
                for(int j = 1; j <= N; j ++){
                    dp[i][j] = Math.max(dp[i-1][j-1] + arr[i][j], dp[i-1][j]+arr[i][j]);
                    if(max < dp[i][j]){
                        max = dp[i][j];
                    }
                }
            }
            // System.out.println(Arrays.deepToString(arr));
            // System.out.println(Arrays.deepToString(dp));
            System.out.println(max);
    
        }
    }
}