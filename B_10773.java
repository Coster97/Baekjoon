import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//int 형 가능
//시간 단축위해 prefix sum 할 것
//스택 사용

public class B_10773 {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> S = new Stack<>();

        int K = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < K; i ++){
            String str = br.readLine();
            int N = Integer.parseInt(str);
           
            if(N == 0){
                S.pop();
            }else{
                S.push(N);
            }

        }
        int sum = 0;
        while(!S.isEmpty()){
            sum += S.pop();
        }
    
        System.out.println(sum);
    }
    
}
