// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.ArrayList;
// import java.util.Stack;
// import java.util.StringTokenizer;

// public class B_2812 {

//     public static void main(String[] args)throws IOException{

//         Stack<Integer> S = new Stack<>();
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         String str = br.readLine();
//         StringTokenizer st = new StringTokenizer(str, " ");
//         StringBuilder sb = new StringBuilder();
//         int N = Integer.parseInt(st.nextToken());
//         int K = Integer.parseInt(st.nextToken());
//         ArrayList<Integer> result = new ArrayList<>();
//         String str2 = br.readLine();
        

//         for(int i = str2.length()-1; i >=0; i --){
//             S.add(str2.charAt(i)-'0');
           
//         }

//         for(int i = 0; i < N-K; i ++){
//             result.add(S.pop());
//         }
  
//         while(!S.isEmpty()){
            
//             int min = Integer.MAX_VALUE;

//             for(int i = 0; i < result.size(); i ++){
//                 if(result.get(i) < min){
//                     min = result.get(i);
//                 }
//             }
//             if(S.peek() > min){
//                 result.remove(result.indexOf(min));
//                 result.add(S.pop());
//             }
//             else if(S.size() == 1 && result.get(0) < result.get(1)){
//                 result.remove(0);
//                 result.add(S.pop());
//             }
//             else if(S.size() != 1 && S.peek() < min){
//                 S.pop();
//             }
//             else if(S.size() == N-K && S.peek() < min){
//                 S.pop();
//             }
//         }

//         for(int i = 0 ; i < result.size(); i ++){

//             sb.append(result.get(i));
//         }

//         System.out.println(sb);
        
//     }
  
    
// }

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;
 
public class B_2812{
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
 
        String input = br.readLine();
 
        char[] arr = input.toCharArray();

        System.out.println(Arrays.toString(arr));
        Deque<Character> dq = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            // 데크의 맨 뒤의 값이 arr[i]보다 작으면 삭제한다.
            // 아래 조건을 만족할 때까지 반복.
            while (K > 0 && !dq.isEmpty() && dq.getLast() < arr[i]) {
                dq.removeLast();
                K--;
            }
            dq.addLast(arr[i]);
        }
        System.out.println(dq.toString());
 
        StringBuilder ans = new StringBuilder();
        // 위 for문에서 K가 0이 되기 전에 끝난 경우를 대비하여
        // dq.size() - K만큼만 출력한다.
        while (dq.size() > K) {
            ans.append(dq.removeFirst());
        }
 
        bw.write(ans.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
 
}