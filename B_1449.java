// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.StringTokenizer;

// public class B_1449 {


//     public static void main(String[] args)throws IOException{

//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         String str = br.readLine();
//         StringTokenizer st = new StringTokenizer(str, " ");

//         int N = Integer.parseInt(st.nextToken());
//         int L = Integer.parseInt(st.nextToken());

//         String str2 = br.readLine();
//         StringTokenizer st2 = new StringTokenizer(str2, " ");

        
//         ArrayList<Integer> arr= new ArrayList<>();

//         for(int i = 0; i < N; i ++){

//             arr.add(Integer.parseInt(st2.nextToken()));


//         }

//         Collections.sort(arr);
        
//         int tp = 0;
//         int sum = 0;
//         int cnt = 0;
//         boolean tf = false;

//         for(int i = 0 ; i < arr.size()-1; i ++){
//             tf = false;
//             sum += arr.get(i+1) - arr.get(i);
      
            
//             if(sum == L){
//                 tp += 1;
//                 sum = 0;
//                 tf = true;
//             }
//             if(sum + 1 == L){
//                 System.out.println(sum+1);
//                 System.out.println(arr.get(i+1));
//                 arr.set(i + 1, 0);
//                 tp += 1;
//                 System.out.println(arr.toString());
//                 sum = 0;
//                 tf = true;
//                 i ++;

                
               

//             }else if(sum > L){
//                 tp += 1;
//                 sum = 0;
//                 tf = true;
                
          
//             }
//         } 
//         System.out.println(sum);
//         System.out.println(tf);
//         System.out.println(tp);    
        
//     }
    
// }

import java.io.*;
import java.util.*;
public class B_1449{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

		int  N = Integer.parseInt(st.nextToken());
		int  L = Integer.parseInt(st.nextToken());
		int pos[] = new int[1001]; //N의 최댓값이 1000이기 때문에 1001로 배열 길이를 지정해줌
		int tape=0;
		String input = br.readLine();
        StringTokenizer st2 = new StringTokenizer(input, " ");
		for(int i=0; i<N; i++) {
			pos[Integer.parseInt(st2.nextToken())] = 1;
		}
   
		for(int i=1;i<=1000;i++) {
			if(pos[i]!= 0) {
				i+=L-1; 
				tape++;
			}
		}

     
		System.out.println(tape);
	}

}