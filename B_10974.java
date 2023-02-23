import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_10974{
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        long length1 = Integer.parseInt(str);
        String value = br.readLine();
        StringTokenizer st = new StringTokenizer(value, " ");
        long [] arr = new long[(int) length1];
       
        for(int i = 0; i < length1; i ++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        long sum = arr[0];
        for(int i = 1; i < arr.length; i ++){
            sum *= arr[i];
            
        }
    
      
        String str2 = br.readLine();
        long  length2 = Integer.parseInt(str2);
        String value2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(value2, " ");
        long [] arr2 = new long[(int) length2];


        for(int i = 0; i < length2; i ++){
            arr2[i] = Integer.parseInt(st2.nextToken());
        }
        long  sum2 = arr2[0];
        for(int i = 1; i < arr2.length; i ++){
            sum2 *= arr2[i];
            
        }   
        System.out.println(gcd(sum, sum2));
    }

    public static long gcd(long a, long b){

        if(a % b == 0){
            return b;
        }else {
			return gcd(b, a % b);
		}
        
    }
}