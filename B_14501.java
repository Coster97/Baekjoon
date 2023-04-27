import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_14501 {

	static int n;
	static int[][] arr;
	static int max;
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n + 1][2];

		for(int i = 1; i <= n; i ++){
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");

			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		dp(1, 0);
		System.out.println(max);
		
	}

	public static void dp(int day , int benefit){

		max = Math.max(max, benefit);

		if(day == n + 1){
			return;
		}

		if(day + arr[day][0] <= n + 1){
			dp(day + arr[day][0], benefit + arr[day][1]);
		}
	
		dp(day + 1, benefit);
		
	}
}