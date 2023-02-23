import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_15666 {

    static int N;
    static int M;
    static int[] arr, ans;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        String str2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(str2, " ");

        arr = new int[N];
        ans = new int[M];

        for(int i = 0; i < arr.length; i ++ ){
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(arr);
        dfs(0, 0);
        System.out.println(sb);


    }
    public static void dfs(int cnt, int start){

        if(cnt == M){
            for(int i = 0 ; i < ans.length; i ++){
                sb.append(ans[i] +  " ");

            }
            sb.append("\n");
            return;
          
        }
        int before = 0;
        for(int i = start ; i < arr.length; i ++){
            if(before != arr[i]){

                ans[cnt] = arr[i];

                dfs(cnt + 1, i);

                before = arr[i];

            }else{
                continue;
            }
         
            
        }
    }   
    
}
