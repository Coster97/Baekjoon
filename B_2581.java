import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2581 {

    static boolean[] prime = new boolean[10001];
    
    public static void main(String[] args) throws IOException {

        prime[0] = prime[1] = true;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String str2 = br.readLine();

        int M = Integer.parseInt(str);
        int N = Integer.parseInt(str2);
        int Min = 0;
        boolean MinResult = false;
        int sum = 0;
        primeMake();

        for(int i = M; i <= N; i ++){
            if(prime[i] == false){
                if(MinResult == false){
                    Min += i;
                    MinResult = true;

                }
                sum += i;
                
            }
           
        }
        

  
        if(MinResult == false){
            System.out.println(-1);
           

        }else{
            System.out.println(sum);
            System.out.println(Min);

        }
       
        

    }
    public static void primeMake(){

        for(int i = 2; i <= Math.sqrt(prime.length); i ++){
            for(int j = i * i; j < prime.length; j += i){
                if(prime[j] == true){
                    continue;
                }else{
                    prime[j] = true;
                }
            }
        }

    }   
}
