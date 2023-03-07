// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.Arrays;
// import java.util.StringTokenizer;

// public class B_11660 {

// 	static int N;
// 	static int M;
// 	static int[][] arr;
// 	static int[][] point;
// 	static int[] prefixArr;
// 	public static void main(String[] args)throws IOException{
		
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		String str = br.readLine();
// 		StringTokenizer st = new StringTokenizer(str, " ");

// 		N = Integer.parseInt(st.nextToken());
// 		M= Integer.parseInt(st.nextToken());
// 		arr = new int[N][N];
// 		point = new int[M][N];

// 		for(int i = 0 ; i < N; i ++){

// 			String str2 = br.readLine();
// 			StringTokenizer st2 = new StringTokenizer(str2, " ");
// 			for(int j = 0; j < N; j ++){
			
// 				arr[i][j] = Integer.parseInt(st2.nextToken());
// 			}
// 		}
		
// 		for(int i = 0 ; i < M; i ++){
// 			String str3 = br.readLine();
// 			StringTokenizer st3 = new StringTokenizer(str3, " ");
// 			for(int j = 0; j < N; j ++){
			
// 				point[i][j] = Integer.parseInt(st3.nextToken());
// 			}
// 		}

// 		System.out.println(Arrays.deepToString(arr));
// 		System.out.println(Arrays.deepToString(point));

// 		int n = 100;
// 		prefixArr = new int[n + 1];

// 		prefix();

// 	}
// 	public static void prefix(){
// 		int index = 0;
// 		int index2 = 0;
// 		int x1 = 0;
// 		int y1 = 1;
// 		int x2 = 2;
// 		int y2 = 3;
// 		int xposition = point[index2][x1]-1;
// 		int yposition = point[index2][y1]-1;
// 		int xposition2 = point[index2][x2]-1;
// 		int yposition2 = point[index2][y2]-1;

// 		while(true){

			
			
// 			prefixArr[index + 1] = prefixArr[index] + arr[xposition][yposition];
// 			System.out.println(arr[xposition][yposition]);
			
// 			System.out.println("x1 : " + xposition);
// 			System.out.println("y1 : " + yposition);
			
// 			System.out.println(Arrays.toString(prefixArr));
// 			if(yposition < N){
// 				yposition ++;

// 				if(yposition == N){
// 					xposition ++;
// 					yposition = point[index2][y1]-1;
// 				}

				
// 			}
// 			if(xposition == xposition2 && yposition == yposition2){
// 				prefixArr[index + 1] = prefixArr[index] + arr[xposition][yposition];
// 				System.out.println(prefixArr[index]);
// 				System.out.println( arr[xposition][yposition]);
// 				System.out.println("x1 : " + xposition);
// 				System.out.println("y1 : " + yposition);
// 				break;
// 			}
// 			index ++;

			
			
// 		}
		
		
   


// 	}
			
// }

import java.util.*;
import java.io.*;
public class B_11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n+1][n+1];
        int[][] dp = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + arr[i][j];
            }
        }
        for (int k = 1; k <= m; k++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int ans = dp[x2][y2] - dp[x2][y1-1] - dp[x1-1][y2] + dp[x1-1][y1-1];
            sb.append(ans + "\n");
        }
        System.out.print(sb);
    }
}