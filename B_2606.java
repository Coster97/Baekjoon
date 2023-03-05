import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2606 {

    static int N;
    static int M;
    static int[][] arr;
    static boolean[] check;
    static int cnt = 0;


    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        arr = new int[N+1][N+1];
        check = new boolean[N+1];

        for(int i = 0 ; i < M; i ++){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] = 1;

        }

        dfs(1);
        System.out.println(cnt-1);
    }
    public static void dfs(int start){

        cnt ++;
        check[start] = true;
        
        for(int i = 0 ; i <= N; i ++){
            if(arr[start][i] == 1 && !check[i])
            dfs(i);
        }

    }
}
