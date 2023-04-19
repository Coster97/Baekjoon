import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_11727 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 3;

        
        for(int i = 3; i <= n; i ++){
            dp[i] = (dp[i - 1] + 2*dp[i - 2]) % 10007;
            // 2xn 크기의 직사각형의 가장 오른쪽 부분을 덮는 타일의 종류에 따라 경우의 수가 달라진다.
            // 오른쪽 부분을 2x1 타일로 덮는 경우, 이전에는 오른쪽 부분이 1x2 타일로 덮혀 있어야 한다. 따라서 2x(n-1) 크기의 직사각형에서 오른쪽 부분을 1x2 타일로 덮는 경우의 수를 그대로 가져온다.
            // 오른쪽 부분을 1x2 타일로 덮는 경우, 이전에는 오른쪽 부분이 2x1 타일 2개로 덮혀 있어야 한다. 따라서 2x(n-2) 크기의 직사각형에서 2x1 타일로 덮는 경우의 수를 그대로 가져온다.
            // 따라서, 2xn 크기의 직사각형을 채우는 방법의 수는 2x(n-1) 크기의 직사각형에서 오른쪽 부분을 1x2 타일로 덮는 경우의 수와 2x(n-2) 크기의 직사각형에서 오른쪽 부분을 2x1 타일로 덮는 경우의 수를 더한 값과 같다.
        }

        System.out.println(dp[n]);

    }
    
}
