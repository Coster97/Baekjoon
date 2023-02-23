import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_14916 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);

        int[] arr = {5,2};
        int cnt = 0;
        int won = 0;

        for(int i = 0; i < arr.length; i ++){
            if(arr[i] <= N && N%5 == 1){
                won += 5;
                while(true){
                    won += 2;
                    cnt ++;
                    if(won > N){
                        won -= 2;
                        cnt --;
                        break;
                    }
                }
                

            }else{
                continue;
            }
            if(won == N){
                System.out.println(won);
                System.out.println(cnt);
               
                break;
            }
        }
       
    }
    
}
