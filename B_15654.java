import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_15654 {

    static int[] arr;
    static int[] ans;
    static boolean[] visit;
    static int b;

    public static void main(String[] args)throws IOException{

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
        for(int i = 0; i < a; i ++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        dfs(0);


    }
    public static void dfs(int cnt){
        if(cnt == b){
            for(int i = 0; i < ans.length; i ++){
                System.out.print(ans[i] + " ");
                
            }
            System.out.println();
            return;
        }
        for(int i = 0 ; i < arr.length; i ++){
            if(!visit[i]){
                ans[cnt] = arr[i];
                visit[i] = true;
                dfs(cnt + 1);
                visit[i] = false;
            }
        }

    }
    
}
