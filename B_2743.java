import java.util.*;
import java.io.*;

class B_2734{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int TC = Integer.parseInt(br.readLine());
        String[] arr = new String[TC];

        for(int i = 0 ; i < TC; i ++){

            arr[i] = br.readLine();
            
        }
        
        for(int i = 0 ; i < arr.length; i ++){
            System.out.print(arr[i].charAt(0));
            System.out.println(arr[i].charAt(arr[i].length()-1));
        }
    }
}