import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_15656 {

    static int b;
    static int[] arr;
    static int[] ans;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int a = Integer.parseInt(st.nextToken());

        b = Integer.parseInt(st.nextToken());
        arr = new int[a];
        ans = new int[b];
        visit = new boolean[a];

        String str2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(str2, " ");
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(arr);

        dfs(0);
        System.out.println(sb);

    }
    public static void dfs(int cnt){
        
        if(cnt == b){
            for(int i = 0; i < ans.length; i ++){
                
                sb.append(ans[i] + " ");
                
            }
            sb.append("\n");
            return;
        }
        for(int i = 0; i < arr.length; i ++){
            ans[cnt] = arr[i];
            dfs(cnt + 1);
     
        }
    }  
}
