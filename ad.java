
import java.io.*;
import java.util.StringTokenizer;

public class ad {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE, result = 0;

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(bf.readLine(), " ");
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			min1 = Integer.min(num1, min1);
			min2 = Integer.min(num2,min2);
		}
		while (n > 0) {
			if (min1 < min2 * n) {
				n -= 6;
				result += min1;
			} else {
				result += min2;
				n-=1;
			}
		}
		System.out.println(result);
	}
}