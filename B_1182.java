import java.io.IOException;
import java.util.Scanner;
 
public class B_1182 {
    public static int n, s;
    public static int[] arr;
    public static int ans = 0;
 
    public static void DFS(int i, int cnt) {
        if (i == n) { // 끝까지 돌았을 때
            return;
 
        } else {
            if (arr[i] + cnt == s) {
 
                ans++;
 
            }
 
            DFS(i + 1, cnt);//n은 당연히 0이 아니니까 처음에는 arr[0](즉 -7) + cnt(즉 0) 을 실행하게 된다. 이때 s는 -7 그리고
                            //arr[1](즉 -5) + cnt(즉 0)을 실행하게 된다. 이때 s는 앞서 축적된 -7에 이번 값이 더해져 -12가 된다.
                            //이런식으로 베얄 전체를 다 더한다. 도는 동안 s값에 도달했다면 ans값이 자동으로 올랐을 것이다.
                            //i이 n에 도달하면 리턴하고 i+1 즉 배열의 두번째 값부터 위의 반복을 동일하게 실행하게 된다.
            DFS(i + 1, cnt + arr[i]);// 지금꺼 더하기
 
        }
 
    }
 
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextInt();
        arr = new int[n];
 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
 
        DFS(0, 0);
        System.out.println(ans);
 
    }
 
}
