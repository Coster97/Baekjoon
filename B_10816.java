// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.*;


// public class B_10816{

//     static ArrayList<Integer> arr = new ArrayList<>();
//     static int[] search;
//     static int cnt = 0;
//     public static void main(String[] args)throws IOException{

//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringBuilder sb = new StringBuilder();
//         String str = br.readLine();
//         int TC = Integer.parseInt(str);

//         String arrInput = br.readLine();
//         StringTokenizer st = new StringTokenizer(arrInput, " ");

       
//         search = new int[TC];

//         for(int i = 0 ; i < TC; i ++){

//             arr.add(Integer.parseInt(st.nextToken()));
            
//         }
//         Collections.sort(arr);
//         String str2 = br.readLine();
//         int TC2 = Integer.parseInt(str2);

//         String find = br.readLine();
//         StringTokenizer st2 = new StringTokenizer(find);

//         for(int i = 0; i < TC2; i ++){
//             int value = Integer.parseInt(st2.nextToken());
//             BS(value);

//             sb.append(cnt + " ");
          
//         }

//         System.out.println(sb);
//     }
//     public static void BS(int key){
//         cnt = 0;
//         int mid;
//         int low = 0;
//         int high = arr.size() -1;

//         while(low<= high){
            

//             mid = (low + high)/2;

//             if(mid > arr.size()-1){
//                 break;
//             }
//             if(key == arr.get(mid)){
             
//                 cnt ++;
              
//                 arr.remove(mid);
            
//             }else if(arr.get(mid) > key){
               
//                 high = mid -1 ;

//             }else{
               
//                 low = mid + 1;
//             }
//         }
//     }
    
// }

// //그냥 배열로 받고 배열 값 하나씩 넘어가면서 이분탐색하기 메소드 쓰지마 걍 솔트도 한번하고 ㅇ

import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class B_10816 {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < M; i++) {
			int key = Integer.parseInt(st.nextToken());
 
			// upperBound와 lowerBound의 차이 값을 구한다.
			sb.append(upperBound(arr, key) - lowerBound(arr, key)).append(' ');
		}
		System.out.println(sb);
	}
 
	private static int lowerBound(int[] arr, int key) {
		int lo = 0; 
		int hi = arr.length; 

		while (lo < hi) {
 
			int mid = (lo + hi) / 2;
			if (key <= arr[mid]) {
				hi = mid;
			}
 
			else {
				lo = mid + 1;
			}
 
		}
        System.out.println("hi + " + hi);
        System.out.println("lo + " + lo);
		return lo;
	}
 
	private static int upperBound(int[] arr, int key) {
		int lo = 0; 
		int hi = arr.length; 

		while (lo < hi) {
 
			int mid = (lo + hi) / 2; // 중간위치를 구한다.
 
			if (key < arr[mid]) {
				hi = mid;
			}
		
			else {
				lo = mid + 1;
			}
 
		}
 
        System.out.println("uplo + " + lo);
		return lo;
	}
	
	
}