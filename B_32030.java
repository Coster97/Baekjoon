
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_32030 {

	public static int lowerBound(int[] array,  int value, int s, int e) {
        while (s < e) {
            int mid = s + (e - s)/2;
            if (value <= array[mid]) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());


		Scanner sc = new Scanner(System.in);

        ArrayList< Integer> arr = new ArrayList<>();

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, "  ");
        for(int i = 0 ; i < TC; i ++){

            arr.add(Integer.parseInt(st.nextToken()));
        }
		
		int LIS[] = new int[TC];

		int cnt = 0;
		LIS[cnt++] = arr.get(0);
		for (int i = 1; i < 8; i++) {
			if(LIS[cnt-1] < arr.get(i)) {
				LIS[cnt++] = arr.get(i);
			}else {
				int idx = lowerBound(LIS, arr.get(i), 0, cnt);
				LIS[idx] = arr.get(i);
			}
		}
		
		System.out.println(Arrays.toString(LIS));
		
	}
}