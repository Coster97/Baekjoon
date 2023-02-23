// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.Arrays;

// public class B_2309{

//     static int[] arr = new int[9];
//     static int[] ans = new int[7];
//     static boolean[] visit = new boolean[9];
//     static StringBuilder sb = new StringBuilder();
    
//     public static void main(String[] args)throws IOException{

//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         for(int i = 0 ; i < 9; i ++){
//             arr[i] = Integer.parseInt(br.readLine());
//         }
//         Arrays.sort(arr);
        
//         dfs(0,0);
//         //System.out.println(sb);

//     }
//     public static void dfs(int cnt, int start){
//         int sum = 0;
       
//         if(cnt == 7){
//             for(int i = 0 ; i < 7; i ++){
//                 sum += ans[i];
//             }
//             if(sum == 100){
             
//                 for(int i = 0 ; i < ans.length; i ++){
//                     //sb.append(ans[i] + "\n");
//                     System.out.println(arr[i]);
                    
                    
//                 }
//                 System.exit(0);
//                 //return;
//             }         
//             else{
//                 return;
//             }
         
//         }
//         for(int i = start; i < 9; i ++){
//             if(!visit[i]){
//                 ans[cnt] = arr[i];
//                 visit[i] = true;
//                 dfs(cnt + 1, i + 1);
//                 visit[i] = false;

//             }
//         }
      
//     }
// }


import java.util.*;
import java.io.*;
public class B_2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    arr[i] = 0;
                    arr[j] = 0;
                    Arrays.sort(arr);
                    for (int k = 2; k < 9; k++) {
                        System.out.println(arr[k]);
                    }
                    return;
                }
            }
        }
    }
}