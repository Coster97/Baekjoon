// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;
// import java.util.Arrays;
// import java.util.StringTokenizer;
 
// public class B_12738_{
 
// 	public static void main(String[] args) throws IOException {
 
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
// 		int N = Integer.parseInt(br.readLine());
 
// 		int[] arr = new int[N];
// 		int[] lis = new int[N];
 
// 		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
// 		for (int i = 0; i < N; i++) {
// 			arr[i] = Integer.parseInt(st.nextToken());
// 		}
 

// 		lis[0] = arr[0];

// 		int length = 1;
		
// 		for (int i = 1; i < N; i++) {
 
// 			int key = arr[i];
	
// 			if (lis[length - 1] < key) {
// 				length++;
// 				lis[length- 1] = key;
// 			} 
// 			else {

// 				int low = 0;
// 				int high = length;

// 				while (low < high) {
// 					int mid = (low + high) >>> 1;
					
// 					if(lis[mid] < key) {
// 						low = mid + 1;
// 					}
// 					else {
// 						high = mid;
					
// 				}

// 				lis[low] = key;
			
// 			}
			
// 		}

// 		System.out.println(length);
//         System.out.println(Arrays.toString(lis));
//     }
// 	}
// }

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B_12738_ {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 증가수열을 저장할 리스트
        List<Integer> list = new ArrayList<>();
        // 입력된 값을 저장할 배열
        int arr[] = new int[n + 1];

        for(int i = 1 ; i <= n; i++) arr[i] = Integer.parseInt(st.nextToken());

        list.add(Integer.MIN_VALUE);

        for(int i = 1 ; i <= n; i++){
            int num = arr[i];
            int left = 1;
            int right = list.size() - 1;

            // 확인하는 숫자가 증가수열의 마지막 수보다 큰 경우
            // 수열에 추가해준다.
            if(num > list.get(list.size() - 1)) list.add(num);
            // 확인하는 숫자가 증가수열의 마지막 수보다 작은 경우
            else{
                // 숫자의 적당한 위치를 찾아
                // 증가수열의 값을 변경해준다.
                while(left < right){
                    int mid = (left + right) >> 1;

                    if(list.get(mid) >= num) right = mid;
                    else left = mid + 1;
                }
                list.set(right, num);
            }
        }
        // 최장 길이 출력
        System.out.println(list.toString());
        sb.append(list.size() - 1 + "\n");

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}