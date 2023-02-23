import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


class DFS{

    public static int n;
    public static int[] arr;
    public static int[] ans;;
    public static boolean[] visit;
    public static int result;
    
    public static void dfs(int cnt){
       System.out.println(Arrays.toString(ans));
        if(cnt == n){
            int sum = 0;
            System.out.println(Arrays.toString(ans));
            for(int i = 0; i < n-1; i ++){
                sum += Math.abs(ans[i] - ans[i+1]);
            }
            result = Math.max(result, sum);
            return;
        }
        for(int i = 0; i < n; i ++){
            if(!visit[i]){
                ans[cnt] = arr[i];
                visit[i] = true;
                dfs(cnt + 1);
                visit[i] = false;

            }
        }
    }
    public static void main(String[] agrs) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        n = Integer.parseInt(str);
        String str2 = br.readLine();
        StringTokenizer st = new StringTokenizer(str2, " ");
        arr = new int[n];
        ans = new int[n];
        visit = new boolean[n];

        for(int i = 0; i < n; i ++){
           
    
            arr[i] = Integer.parseInt(st.nextToken());
          
        }

        dfs(0);
        System.out.println(result);
        
    }
}