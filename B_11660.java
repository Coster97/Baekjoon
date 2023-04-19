import java.util.*;
import java.io.*;

public class B_11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        // n과 m을 입력받음
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 2차원 배열을 입력받음
        int[][] arr = new int[n+1][n+1];

        // dp 배열을 초기화
        int[][] dp = new int[n+1][n+1];

        // arr 배열을 입력받음
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // dp 배열을 구함
        for(int i = 1; i <=n; i ++){
            for(int j = 1; j <=n; j ++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + arr[i][j];
            }
        }

        // 배열 arr와 dp, 그리고 StringBuilder에 저장된 값을 출력
        for(int i = 0; i < m; i ++){
            String str2 = br.readLine();
            StringTokenizer st2 = new StringTokenizer(str2, " ");
            int x1 = Integer.parseInt(st2.nextToken());
            int y1 =  Integer.parseInt(st2.nextToken());
            int x2 =  Integer.parseInt(st2.nextToken());
            int y2 =  Integer.parseInt(st2.nextToken());
            int ans = dp[x2][y2] - dp[x2][y1-1] - dp[x1-1][y2] + dp[x1-1][y1-1];
            sb.append(ans + "\n");
        }

        System.out.print(sb);
    }
}
