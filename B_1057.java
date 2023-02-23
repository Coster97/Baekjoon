import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_1057 {

    static int[] arr;
    static Integer[] ans;
    static int[][] arr2;    
    static boolean[] visit;
    static int N;
    static int M;
    static int sum;
   

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        ans = new Integer[M];
        arr2 = new int[M][2];
    
       
        visit = new boolean[N];
        int arraynum = 1;
        for(int i = 0; i < N; i ++){
            arr[i] = arraynum;
            arraynum ++;
     
        }

        for(int i = 0; i < M; i ++){
            String str2 = br.readLine();
            StringTokenizer st2 = new StringTokenizer(str2, " ");
            arr2[i][0] = Integer.parseInt(st2.nextToken());
            arr2[i][1] = Integer.parseInt(st2.nextToken());
     
        }
        dfs(0,0);
        //System.out.println(sum);
        



    }
    public static void dfs(int cnt, int start){
   
        if(cnt == M){
   
            for(int i = 0 ; i < arr2.length; i ++){
              
            if(Arrays.asList(ans).contains(arr2[i][0]) && Arrays.asList(ans).contains(arr2[i][1])){
                sum ++;
                // System.out.println(result);
                
            } 
            if(sum < 2){
                System.out.println(Arrays.toString(ans));
                sum = 0;
            }
            
        }
        return;
        }
       
        for(int i = start; i < 5; i ++ ){
            if(!visit[i]){
                ans[cnt] = arr[i];
                visit[i] = true;
                dfs(cnt + 1, i + 1);
                visit[i] = false;

            }
        }
    } 
}
