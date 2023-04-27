import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_15486 {

    static int[] dp;
    static int n;
    static int[][] arr;
    static int max;

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1][2];

        for(int i = 1; i <= n; i ++){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());

        }
        dp();
        System.out.println(max);
        System.out.println(Arrays.toString(dp));
    }

    public static void dp(){


        dp = new int[n + 2];


        for(int i = 1; i <= n; i ++){

            int next = i + arr[i][0];
            //선택한 상담을 마친 날짜

            if(next <= n+1){
                //만약 그 날짜가 퇴사 전 또는 퇴사날에 맞춰 끝난다면?
                dp[next] = Math.max(dp[i] + arr[i][1], dp[next]);
                //dp[그 상담을 마친 날짜에는] = dp[상담시작일 날짜에 이미 축적 되어있는 베네핏] + 상담시작일에 주어진 베네핏과 dp[상담을 마친 날짜에 저장된 베네핏을 비교한다] 만약 후자가 더 크다면 후자의 상담을 해야하고 아니라면 그 상담 전의 상담이 제일 큰 베네핏
            }

            dp[i + 1] = Math.max(dp[i], dp[i + 1]);
            //선택된 상담 다음 상담의 베네핏 값은 = 그 이전 상담 베네핏과 그 다음 상담 베네핏 값을 비교하여 저장한다.

        }
        max = dp[n+1];
    }
    
}
