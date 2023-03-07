import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Stack;


public class B_10828 {
    public static void main(String[] args)throws IOException{

        Stack<Integer> S = new Stack<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i ++){

            String str = br.readLine();
  
           if(str.equals("pop")){
                if(!S.isEmpty()){
                    sb.append(S.pop() + "\n");
                }else{
                    sb.append(-1 + "\n");
                }
               
            }else if(str.equals("size")){
                sb.append(S.size()+ "\n");
            }else if(str.equals("empty")){
                if(S.isEmpty()){
                    sb.append(1+ "\n");
                }else{
                    sb.append(0+ "\n");
                }
            }else if(str.equals("top")){
                if(!S.isEmpty()){
                    sb.append(S.peek()+ "\n");
                }else{
                    sb.append(-1+ "\n");
                }
              
            }else{
                String[] A = str.split(" ");
                S.push(Integer.parseInt(A[1]));

            }
    
        }
        System.out.println(sb);

    }
    
}
