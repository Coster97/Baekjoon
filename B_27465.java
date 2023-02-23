import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_27465 {


    public static void main(String[] args)throws IOException{
       

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        boolean[] prime = new boolean[N * 100];
        prime[0] = prime[1] = true;


        for(int i = 2; i <= Math.sqrt(prime.length); i ++){
            for(int j = i * i; j < prime.length; j += i){
                if(prime[j] == true){
                    continue;
                }else{
                    prime[j] = true;
                }
            }
        }

        for(int i = 0 ; i < prime.length; i ++){

            if(prime[i]==true && i >= N*2){
                System.out.println(i);

                break;
            }


        }

    }
    
}

