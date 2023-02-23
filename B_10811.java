import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class B_10811 {

    public static void main(String[]args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < N; i ++){

            arr.add(i + 1);
        }

        while(true){

            
            M --; 
            if(M < 0){
                break;
            }
            String str2 = br.readLine();
            StringTokenizer st2 = new StringTokenizer(str2, " ");
            int start = Integer.parseInt(st2.nextToken());
            int end = Integer.parseInt(st2.nextToken());
            if(Math.abs(end - start) == 1){
                // System.out.println("나 1");
                // System.out.println("start " + start);
                // System.out.println("end " + end);
                Collections.swap(arr, start-1,end-1);


              
            }else if(Math.abs(end - start) % 2 == 0){
                for(int i = 0 ; i < Math.abs(end - start)/2; i ++){
                   // System.out.println("홀");
                    Collections.swap(arr, start-1,end-1);
                    // System.out.println("start " + start);
                    // System.out.println("end " + end);
                    start ++;
                    end --;
                   // System.out.println(arr.toString());
                    
                }
            }else if(Math.abs(end - start) % 2 != 0){
                for(int i = 0; i <= Math.abs(end - start); i ++){
                    //System.out.println("짝");
                    Collections.swap(arr, start-1,end-1);
                    // System.out.println("start " + start);
                    // System.out.println("end " + end);
                    start ++;
                    end --;
                   // System.out.println(arr.toString());
                    
                }
            }else if(Math.abs(end - start) == 0){
                // System.out.println("ㄴ");
                // System.out.println("start " + start);
                // System.out.println("end " + end);
          
            }
         
        }
        for(int i = 0 ; i < arr.size(); i ++){
            System.out.print(arr.get(i)  +  " ");
        }
       
    }

    
    
}


// import java.io.IOException;
// import java.util.Scanner;

// public class Main {

// 	public static void main(String[] args) throws IOException {
// 		Scanner sc = new Scanner(System.in);

// 		int[] arr = new int[sc.nextInt()];
// 		for (int i = 0; i < arr.length; i++) { // 기본배열 생성
// 			arr[i] = i + 1;
// 		}

// 		int N = sc.nextInt();
// 		for (int i = 0; i < N; i++) {
// 			int order1 = sc.nextInt() - 1;
// 			int order2 = sc.nextInt() - 1;
			
// 			while (order1 < order2) {
// 				int temp = arr[order1];
// 				arr[order1++] = arr[order2];
// 				arr[order2--] = temp;
// 			}

// 		}
// 		String ret = "";
// 		for (int j = 0; j < arr.length; j++) {
// 			ret += arr[j] + " ";
// 		}
// 		System.out.print(ret.trim());
// 		sc.close();
// 	}
// }