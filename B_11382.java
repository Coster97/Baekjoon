import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class B_11382 {
    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
       
        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());
        BigInteger C = new BigInteger(st.nextToken());
        BigInteger add = A.add(B);
        System.out.println(add.add(C));
    }
}