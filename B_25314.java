import java.io.*;
import java.util.*;


public class B_25314 {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while(true){

            if(N == 0){
                break;

            }
            N  -= 4;
            System.out.print("long" + " ");
        }


        System.out.print("int");
    }
    
}
