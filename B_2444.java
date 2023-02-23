import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2444 {

    public static void main(String[]args)throws IOException{

        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

       int cnt = 0;
       int star = 1;
       int space = n-1;
        while(true){

           
            if(cnt == n){
                break;
            };
            for(int i = 0; i <space; i++){
                System.out.print(" ");
            }
            for(int i = 0; i < star; i ++){
                  System.out.print("*");
            }
            // for(int i = 0; i <space; i ++){
            //     System.out.print(" ");
            // }
            star += 2;
            space --;
            cnt ++;

            System.out.println();
            
        }
        cnt = 0;
        star -= 4;
        space +=2;
        while(true){

            
            cnt ++;

            if(cnt == n){
                break;
            };
            for(int i = 0; i <space; i++){
                System.out.print(" ");
            }
            for(int i = 0; i < star; i ++){
                  System.out.print("*");
            }
            // for(int i = 0; i <space; i ++){
            //     System.out.print(" ");
            // }
            star -= 2;
            space ++;
            System.out.println();
        }
       


    }
    
}
