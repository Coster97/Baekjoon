import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10988 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int start = str.length() -1;
        boolean tf = false;

        loop : if(str.length() % 2 == 0){

            for(int i = 0 ; i < str.length()/2; i ++){

                for(int j = start; j >= str.length()/2; j --){
    
    
                    if(str.charAt(i) != str.charAt(j)){
    
                        tf = false;
                        break loop;
                    }else{
                        tf = true;
                        break;
                        
                        
                    }
    
                }
                start --;
               
            }

        }else{

           loop2 : for(int i = 0 ; i < str.length()/2; i ++){

                for(int j = start; j > str.length()/2; j --){
               
    
                    if(str.charAt(i) != str.charAt(j)){
    
                        break loop2;
                     
                    }else{
                        tf = true;
                        break;
                       
                        
                    }
    
                }
                start --;
               
            }

        }
        


        if(tf == true){

            System.out.println(1);
        }else if(str.length() == 1){
            System.out.println(1);

        }else{
            System.out.println(0);
        }

    }
    
}
