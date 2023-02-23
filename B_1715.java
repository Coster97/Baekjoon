import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;


public class B_1715 {
    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> stack = new PriorityQueue<>();

        for(int i = 0 ; i< N; i ++){
            stack.add(Integer.parseInt(br.readLine()));
        }
        int cnt = 0;
        int sum = 0;
        int result = 0;

        while(true){
            sum += stack.peek();
            stack.poll();
            cnt ++;
            if(cnt % 2 == 0){
                stack.add(sum);
                result += sum;
                sum = 0;
        
            }
            if(stack.size() == 0){
                break;
            }
             
        }

        System.out.println(result);

    }
}
