import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2579 {

    static int n;
    static int[] arr;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = arr[1];
        if (n >= 2) {
            dp[2] = arr[1] + arr[2];
        }

        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + arr[i - 1]) + arr[i];
            //dp[4]로 예를 들면, 2,4 순서로 계단을 밟거나 1, 3, 4 순서로 계단을 밟거나이다. 그걸 표현한거 같은데?
            //왜 첫번째 항목은 그냥 dp[i-2]냐면 dp[2]가 이미 dp[1] dp[2]를 포함하는 즉 1 2 순서로 계단을 밟아온것을 포함하는 값이기 때문이다.!
            //내 생각에는 dp[i-3]은 기존에 있는 dp[i] 의 베네핏과 비교하기 위한 용도? 인거 같은데 잘 모르게따
        }

        System.out.println(dp[n]);

    }

}
