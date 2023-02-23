import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B {
    
    public static int B;
    public static int A;
    public static boolean[] visit;
    public static int[] arr;
    public static int[] ans;
    public static int result;
    
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        visit = new boolean[A];
        arr = new int[A];
        ans = new int[B];
   
        int num = 1;
        
        for(int i = 0; i < A; i ++){
            arr[i] = num++;
        }
        dfs(0);
        //System.out.println(result);      
    }
    public static void dfs(int cnt) throws IOException{
        if(cnt == B){
                  
            for(int i = 0; i < ans.length; i ++){
                if(i == ans.length-1){
                    System.out.print(ans[i] + " \n");
                    return;
                }
                System.out.print(ans[i] + " ");
                       
            }
            return;
        }
        for(int i = 0; i < A; i ++){
           
            if(!visit[i]){
                ans[cnt] = arr[i];
                visit[i] = true;
                dfs(cnt + 1);
                visit[i] = false;
            }
        }       
    }
}
