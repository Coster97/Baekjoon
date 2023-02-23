import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;


class Blackjack{

    public static int length;
    public static int Max;
    public static int[] arr;
    public static int[] ans;;
    public static boolean[] visit;
    public static int result;
    public static int result2;
    
    public static void dfs(int cnt){
       
        if(cnt == 3){
            System.out.println(Arrays.toString(ans));
            int sum = 0;
            for(int i = 0; i < 3; i ++){
                sum += ans[i];
            }
            if(sum == Max){
                result = sum;
               
            }else if(sum < Max){
                result2 = Math.max(result2, sum);
                

            }
            
            return;
        }
        for(int i = 0; i < length; i ++){
            for(int j = 0; j < 3; j ++){
                if(!visit[i]){
                    ans[cnt] = arr[i];
                    visit[i] = true;
                    dfs(cnt + 1);
                    visit[3] = false;
                }
            }
        }
    }
    public static void main(String[] agrs) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        length = Integer.parseInt(st.nextToken());
        Max = Integer.parseInt(st.nextToken());
        arr = new int[length];
        ans = new int[3];
        String str2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(str2, " ");
       
        visit = new boolean[3];

        for(int i = 0; i < length; i ++){
    
            arr[i] = Integer.parseInt(st2.nextToken());
        
          
        }

        dfs(0);
        System.out.println(result);
        
    }
}