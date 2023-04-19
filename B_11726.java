import java.util.Arrays;
import java.util.Scanner; // Scanner 클래스를 사용하기 위한 import문

public class B_11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성
        int n = sc.nextInt(); // n 입력 받기
        int[] dp = new int[n + 1]; // dp 배열 초기화
        dp[1] = 1; // 초기값 설정
        if (n >= 2) { // 예외 처리
            dp[2] = 2; // 초기값 설정
        }
        for (int i = 3; i <= n; i++) { // dp 값 구하기
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007; // 점화식
            // 2xn 크기의 직사각형의 가장 오른쪽 부분을 덮는 타일의 종류에 따라 경우의 수가 달라진다.
            // 오른쪽 부분을 2x1 타일로 덮는 경우, 이전에는 오른쪽 부분이 1x2 타일로 덮혀 있어야 한다. 따라서 2x(n-1) 크기의 직사각형에서 오른쪽 부분을 1x2 타일로 덮는 경우의 수를 그대로 가져온다.
            // 오른쪽 부분을 1x2 타일로 덮는 경우, 이전에는 오른쪽 부분이 2x1 타일 2개로 덮혀 있어야 한다. 따라서 2x(n-2) 크기의 직사각형에서 2x1 타일로 덮는 경우의 수를 그대로 가져온다.
            // 따라서, 2xn 크기의 직사각형을 채우는 방법의 수는 2x(n-1) 크기의 직사각형에서 오른쪽 부분을 1x2 타일로 덮는 경우의 수와 2x(n-2) 크기의 직사각형에서 오른쪽 부분을 2x1 타일로 덮는 경우의 수를 더한 값과 같다.
        }
        System.out.println(Arrays.toString(dp));
        System.out.println(dp[n]); // 결과 출력
    }
}
