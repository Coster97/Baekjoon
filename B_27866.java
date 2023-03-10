import java.io.*;
import java.util.*;

class B_27866{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(br.readLine());
        
         System.out.println(str.charAt(N-1));
    }
}