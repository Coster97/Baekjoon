import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_14501{
	static int n;
	static int[][] arr;
	static int max;
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n+1][2];
		

		for(int i = 1; i <= n; i ++){

			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());

		}

		dp(1,0);
		System.out.println(max);
		
	}
	public static void dp(int today, int benefit){

		//주어진 베네핏중에 제일 큰 값을 도출
		max = Math.max(max, benefit);

		//today가 주어진 일정의 끝과 같을때
		if(today == n+1){
			return;
		}
		//만약 today + 해당 날짜 상담의 소요기간이 주어진 일정의 끝보다 작을때
		if(today + arr[today][0] <= n + 1){
			//일정 소화, 베네핏 추가
			dp(today+arr[today][0], benefit+arr[today][1]);

		}else{
			// 아닐경우에는 다음 날짜상담으로 다시 함수 호출, 베네핏은 그대로 유지
			dp(today+1, benefit);
		}
	

	}
}