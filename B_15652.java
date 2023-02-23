import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_15652 {

    static int[] arr;
    static int N;
    static int M;
    static  StringBuilder sb = new StringBuilder();

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];

        dfs(0,1);

        
 

    }

    public static void dfs(int depth,int start){
        if(depth==M){
            for(int i = 0 ; i < M; i ++){
                System.out.print(arr[i] + " ");
               
            }
            System.out.println();
            return;

         
        }
        for(int i=start;i<=N;i++){
                arr[depth] = i;
        
                dfs(depth+1,i); 
            
        }
    }
}
