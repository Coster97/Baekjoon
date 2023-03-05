import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_11724{

    static int N;
    static int M;
    static int[][] arr;
    static boolean[] check;
    static int cnt = 0;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String NM = br.readLine();
        StringTokenizer stNM = new StringTokenizer(NM, " ");
        N = Integer.parseInt(stNM.nextToken());
        M = Integer.parseInt(stNM.nextToken());
        arr = new int[N+1][N+1];
        check = new boolean[N+1];

        for(int i = 0 ; i < M; i ++){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] = 1;

        }

       // dfs(1);
        for(int i = 1; i <= N ; i ++){
            if(!check[i]){
                dfs(i);
                cnt ++;
            }else{
                continue;
            }
        }
      
        System.out.println(cnt);
  
    }
    public static void dfs(int start){


        check[start] = true;
        
        for(int i = 0 ; i <= N; i ++){
            if(arr[start][i] == 1 && !check[i])
            dfs(i);
        }
    }
}
