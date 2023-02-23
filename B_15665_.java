import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_15665_ {

    static int[] arr, ans;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");
        
        int N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        ans = new int[M];
        String str2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(str2," ");


        for(int i = 0; i < arr.length; i ++ ){

            arr[i] = Integer.parseInt(st2.nextToken());

        }
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        dfs(0);
    }

    public static void dfs(int cnt){
        if(cnt == M){
            System.out.println(Arrays.toString(ans));
            return;
        }else {
			
			int num = 0;
			for (int i=0; i<arr.length; i++) {
				if (num == arr[i]) continue;
				ans[cnt] = arr[i];
				dfs(cnt+1);
				
				num = arr[i];
			}
			
		}
            
    }
    
}