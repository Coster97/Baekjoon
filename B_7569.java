import java.io.*;
import java.util.*;

public class B_7569 {

    static int[] dz = {-1, 1, 0, 0, 0, 0};
    static int[] dx = {0, 0, -1, 1, 0, 0};
    static int[] dy = {0, 0, 0, 0, -1, 1};

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        int[][][] arr = new int[H][N][M];

        for(int i = 0; i < H; i ++){
            for(int j = 0; j < N; j ++){
                st = new StringTokenizer(br.readLine());
                for(int k = 0; k < M; k ++){
                    arr[i][j][k] = Integer.parseInt(st.nextToken());
                }
            }
        }

        Queue<int[][]> q = new LinkedList<>();

        for(int i=0; i < H; i++) {
			for(int j=0; j < N; j++) {
                for(int k = 0; k < M; k ++){
                    if(arr[i][j][k] == 1) {
                        int[][] coord = new int[][]{{i, j, k}}; // 3차원 배열 생성
                        q.add(coord); // 3차원 배열을 Queue에 추가
                    }
                }
			}
		}

        
        while(!q.isEmpty()){
            int now[][] = q.poll();
            int nowH = now[0][0];
            int nowN = now[0][1];
            int nowM = now[0][2];

           
            for(int i = 0; i < 6; i ++){
                
                int nextH = nowH + dz[i];
                int nextN = nowN + dx[i];
                int nextM = nowM + dy[i];

               
     
                if(nextH < 0 || nextN < 0 || nextM < 0 || nextH > H-1 || nextN > N-1 || nextM > M-1){
     
                    continue;
                }
    
                  
                
                if(arr[nextH][nextN][nextM] != 0){

                    continue;
                }

                

                arr[nextH][nextN][nextM] = arr[nowH][nowN][nowM] + 1;

                //토마토가 익었으니 q에 포지션을 추가
                int[][] coord2 = new int[][]{{nextH, nextN, nextM}}; // 3차원 배열 생성
                q.add(coord2); 

                //위 조건들에 걸리지 않는다면 즉 배열의 범위 안에 있고, 토마토가 아직 익지 않은 포지션이라면 1을 더해 익었다고 표시
				
            }
        }
        int maxVal = 0;
        for(int i=0; i<H; i++) {
            for(int j=0; j<N; j++) {
                for(int k=0; k<M; k++){
                    if(arr[i][j][k] == 0) {
                        //토마토 배열을 쭉 돌아보면서 0이 존재하면 익지 않은 토마토가 있는 것이기 때문에 -1을 출력하고 코드를 아예 종료한다.
                        System.out.println(-1);
                        System.exit(0);
                    }
                    //아닐 경우엔 배열 안에서 제일 큰 수를 maxVal에 저장 후 -1을 하여 출력
                     maxVal = Math.max(maxVal, arr[i][j][k]);
                }
               
            }
        }
        System.out.println(maxVal-1);
    }
}
