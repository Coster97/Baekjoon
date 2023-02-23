import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BB_10974 {

    public static int length;
    public static int[] arr;
    public static int[] ans;
    public static String result;
    public static  boolean[] visit;

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        length = Integer.parseInt(str);
        arr= new int[length];
        visit = new boolean[length];
    
       
        dfs(0);
       
     

    }

    public static void dfs(int cnt){
        
        
        if(cnt == length) {
			for(int i=0;i<length;i++)
				System.out.print(arr[i]+" ");
			System.out.println();
			return ;
		}
		
         for(int i = 0; i < length; i ++){
             if(!visit[i]){
                 arr[cnt] = i+1;
                 visit[i] = true;
                 dfs(cnt + 1);
                 visit[i] = false;
 
             }
         }
     }
}
