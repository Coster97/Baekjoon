import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_14002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        // 배열 초기화
        int[] arr = new int[N];     // 입력받은 수열
        int[] lis = new int[N];     // LIS를 저장할 배열
        int[] lisLen = new int[N];  // LIS의 길이를 저장할 배열

        // 입력받은 수열 arr 배열에 저장
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // LIS 구하기
        for (int i = 0; i < N; i++) {
            lis[i] = arr[i];
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && lis[i] < lis[j] + arr[i]) {
                    lis[i] = lis[j] + arr[i];
                }
            }
        }

        // LIS의 길이 구하기
        for (int i = 0; i < N; i++) {
            lisLen[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && lisLen[i] < lisLen[j] + 1) {
                    lisLen[i] = lisLen[j] + 1;
                }
            }
        }

        // LIS의 최대 길이와 최대 길이를 가진 수열의 마지막 인덱스 구하기
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < lisLen.length; i++) {
            if (max < lisLen[i]) {
                max = lisLen[i];
                maxIndex = i;
            }
        }

        // LIS 수열 구하기
        int[] answer = new int[lis[maxIndex]];
        int cnt = lis[maxIndex] - 1;
        answer[cnt] = arr[maxIndex];
        for (int i = maxIndex - 1; i >= 0; i--) {
            if (arr[i] < arr[maxIndex] && lis[maxIndex] == lis[i] + arr[maxIndex]) {
                maxIndex = i;
                answer[--cnt] = arr[i];
            }
        }

        // 출력
        sb.append(max + "\n");
        for (int i = 0; i < answer.length; i++) {
            if(answer[i] != 0) {
                sb.append(answer[i] + " ");
            }
          
        }
        System.out.println(sb);
    }

}
