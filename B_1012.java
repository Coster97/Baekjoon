import java.io.*;
import java.util.*;


public class B_1012{
    private static int dx[] = {0,0,1,-1};
    private static int dy[] = {1,-1,0,0};
    private static int[] aparts = new int[50*50];
    private static int apartNum; //아파트 단지 번호의 수
    private static boolean[][] visited = new boolean[50][50]; //방문여부
    private static int[][] map; //지도
    private static StringBuilder sb = new StringBuilder();
   

    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < N; i ++){

            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            
            map = new int[50][50];
            visited = new boolean[50][50];
            for(int j = 0; j < C; j ++){
                String str2 = br.readLine();
                StringTokenizer st2 = new StringTokenizer(str2, " ");
                int a = Integer.parseInt(st2.nextToken());
                int b = Integer.parseInt(st2.nextToken());

                map[a][b] = 1;
            }
            visit();
            
        }
        System.out.println(sb);

    }
    private static void visit(){
        apartNum = 0;
        for(int i=0; i<50; i++){
            for(int j=0; j<50; j++){
                if(map[i][j] == 1 && !visited[i][j]){
                    apartNum++;
                    dfs(i,j);
                }
            }
        }

        Arrays.sort(aparts);
        sb.append(apartNum + "\n");  

    }
    
    private static void dfs(int x, int y) {
        visited[x][y] = true;
        aparts[apartNum]++;

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >=0 && ny >=0 && nx < 50 && ny < 50){
                if(map[nx][ny] == 1 && !visited[nx][ny]){
                    dfs(nx,ny);
                }
            }
        }
    }
}