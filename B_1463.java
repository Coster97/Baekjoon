import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1463 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        int cnt = 0;

        while(true){
            if(N == 1){
                break;
            }
            if(N == 2){
                cnt ++;
                break;
            }
            if(N%2 != 0 && N%3 != 0){
                
                N = N - 1;
                cnt ++;
        
            }
            if(N%2 == 0 && (N - 1) % 3 == 0){
                N = N - 1;
                cnt ++;
             
                if(N % 3 == 0){
                    while(true){
                        N = N / 3;
                        cnt ++;
                        if(N == 1){
                            break;
                        }
                    }
                }
            }
            if(N%3 == 0){
                while(true){
                    N = N / 3;
                    cnt ++;
                    if(N % 2== 0){
                        break;
                    }
                    if(N == 1){
                        break;
                    }
                    
                }
            }
            
        }
        
        System.out.println(cnt);
      
    }
    
}
