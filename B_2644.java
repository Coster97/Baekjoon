import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B_2644 {

    static int N, M;
    static int[][] arr;
    static boolean[] visit;

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int T = Integer.parseInt(str);

        String str2 = br.readLine();
        N = Integer.parseInt(str2);
        M = Integer.parseInt(str2);

        String str3 = br.readLine();
        int C = Integer.parseInt(str3);

        arr = new int[T+1][T+1];
        visit = new boolean[T+1];

        for(int i = 0 ; i < C; i ++){
            String str4 = br.readLine();
            StringTokenizer st = new StringTokenizer(str4, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = 1;
            
        }

        dfs(N);



        
    }

    public static void dfs(int start){
        

    }
    
}
