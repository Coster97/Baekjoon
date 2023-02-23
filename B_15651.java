import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B_15651 {
    static int N;
    static int cnt;
    static int[] arr;
    static String result;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        N = Integer.parseInt(st.nextToken());
        cnt = Integer.parseInt(st.nextToken());
        arr = new int[cnt];
             
       
        dfs(0);
        System.out.println(sb);

    }
    public static void dfs(int depth) throws IOException{
        
        if(depth == cnt){
          
            for (int i = 0; i < cnt; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append('\n');
			return;
		}
           
        
        for(int i = 1; i <= N; i ++ ){
            arr[depth] =i;
            dfs(depth + 1);

        }

    }
    
}
