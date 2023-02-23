import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2839 {
//몫이 5고 나머지가 3이라면 같은 조건문으로 실행할 것.
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int N = Integer.parseInt(str);
        int cnt = 0;
        while(true){

            if(N == 0){
                break;
            }

            
            if(N/5 != 0 && N%5 == 0){
           
                cnt += N/5;
                N = 0;
                System.out.println(cnt);
                break;
             
            }
            
            if(N/5 != 0 && (N%5) % 3 == 0){
               
                cnt += N/5;
                cnt += (N%5)/3;
                N = 0;
                System.out.println(cnt);
                break;
            }
    
            if(N % 3 != 0 && N % 5 != 0){
                System.out.println(-1);
                break;
            }else if(N<8 && N%3 == 0){
                cnt += N/3;
                N = 0;
                System.out.println(cnt);
                break;
            }else{
               
                while(true){
    
                   
                    if(N == 0){
                        break;
                    }
                    if(N%5 == 0){
                        cnt += N/5;
                        N = 0;
                        System.out.println(cnt);
                    }else{
                        N -=3;
                        cnt ++;
                    }
                }
              
            }
            
           

        }
        
     
      
    }
}