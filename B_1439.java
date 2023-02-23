import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1439 {

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int A = str.charAt(0);
        int B  = 5;
        int C = str.charAt(0);
        int AC = 1;
        int BC = 0;
        //110011
        for(int i = 1 ; i < str.length(); i ++){
            
            if(str.charAt(i) != A && B == 5){
              
                B = str.charAt(i);
                BC ++;
                A = B;
                
            }
            if(str.charAt(i) != A && B != 5){
                if(str.charAt(i) != B){
          
                    AC ++;
                    A = C;

                }
            }
            if(str.charAt(i) != A && B != 5){
   
                    BC ++;
                    A = B;
                
            }
        }



        System.out.println(Math.min(AC, BC));


    }
    
}
