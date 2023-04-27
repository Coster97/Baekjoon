import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class B_1535 {


    static int N;
    static int[][] arr;
    static int[][] dp;
    static int max;

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int k = 99;
        arr = new int[N+1][N+1];
        dp = new int[N+1][k+1];
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        for(int i = 1 ; i <= N; i ++){
            arr[0][i] = Integer.parseInt(st.nextToken());
        }

        String str2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(str2, " ");
        for(int i = 1 ; i <= N; i ++){
            arr[1][i] = Integer.parseInt(st2.nextToken());
        }

        System.out.println(Arrays.deepToString(arr));
        for (int i = 1; i <= N; i++) {
            //배열 포문 돌릴거임
            for (int j = 1; j <= k; j++) {
                if (arr[0][i] <= j) {
                    //만약 j 보다 체력 값이 작다면
                    dp[i][j] = Math.max(dp[i-1][j-arr[0][i]]+arr[1][i], dp[i-1][j]);
                    //
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.print(dp[N][k]);
    }

}
