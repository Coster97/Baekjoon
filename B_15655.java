import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_15655 {

    static int[] arr;
    static int[] ans;
    static int b;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        String str2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(str2);

        arr = new int[a];
        ans = new int[b];

        for(int i = 0 ; i < arr.length; i ++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(arr);
        dfs(0, 0);

    }
    public static void dfs(int cnt, int start){
        if(cnt == b){
            for(int i = 0; i < ans.length; i ++){
                System.out.print(ans[i] + " ");
                
            }
            System.out.println();
            return;
           
        }
        for(int i = start; i < arr.length; i ++){
            ans[cnt] = arr[i];
            dfs(cnt + 1, i + 1);
        }

    }
    
}
