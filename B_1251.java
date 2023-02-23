import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1251 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String a;
        String aR;

        loop : for(int i = 0 ; i < str.length(); i ++){

            for(int j = 97; j <= 122; j ++){

                if(str.charAt(i)==(char)j){
                    a = str.substring(0, i);
                    aR = new StringBuilder(a).reverse().toString();
                    
                    //break loop;
                }
                else{
                    continue;
                }

            
            }
            

        }

        
        String b = str.substring(2,str.length()-2);
        String c = str.substring(str.length()-2, str.length());
        
        String bR = new StringBuilder(b).reverse().toString();
        String cR = new StringBuilder(c).reverse().toString();
        //System.out.println(aR);
  
        System.out.println(bR);
        System.out.println(cR);
     
    }
    
}
