import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_15650 {

    static int[] arr;
    static int[] ans;
    static boolean[] visit;
    static int B;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        arr = new int[A];
        ans = new int[B];
        visit = new boolean[A];
        int start = 1;
        for(int i = 0; i < A; i ++){

            arr[i] = start++;

        }
        dfs(0,0);      

    }

    public static void dfs(int cnt, int start){
        if(cnt == B){

            for(int i = 0; i < ans.length; i ++){

                System.out.print(ans[i] + " ");

            }
            System.out.print("\n");           
            return;
 
        }

        for(int i = start; i < arr.length; i++){
            if(!visit[i]){
                ans[cnt] = arr[i];
                visit[i] = true;
                dfs(cnt+1, i + 1); // 스타트에 더하는거아니다!! 시작점 바꿔야하니까 i 건드려!
                visit[i] = false;

            }
        }
     }
}
