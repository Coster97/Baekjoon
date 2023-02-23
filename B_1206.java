import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_1206 {

    

    static int N;
    static int M;
    static int V;

    static int[][] arr; 
    static boolean[] visit;
    static int[] ans; 

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); 
        StringTokenizer st = new StringTokenizer(str, " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        arr = new int[M][2];
        visit = new boolean[N];
        ans = new int[N];
    

        for(int i = 0 ; i < arr.length ; i ++){

            String str2 = br.readLine();
            StringTokenizer st2 = new StringTokenizer(str2, " ");

            arr[i][0] = Integer.parseInt(st2.nextToken());
            arr[i][1] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arr, (o1, o2) -> {
            if(o1[0] < o2[0]){
                return Integer.compare(o1[0], o2[0]);
            }else if(o1[0] ==  o2[0]){
                return Integer.compare(o1[1], o2[1]);
            }
            return Integer.compare(o1[0], o2[0]);
        });

        System.out.println(Arrays.deepToString(arr));
        ans[0] = V;

        DFS(1);
        //System.out.println(BFS(0));


    } 

    public static void DFS(int cnt){

        if(cnt == N){
            System.out.println(Arrays.toString(ans));
            return;

        }

        for(int i = 0 ; i < arr.length; i ++){

            if(!visit[i]){
                visit[i] = true;
                ans[cnt] = arr[i][1];
                DFS(cnt + 1);
                visit[i] = false;

            }
        }    

    }

    public static int BFS(int cnt){

        if(cnt == M){
            

        }

        return 0;
        

    }
}
