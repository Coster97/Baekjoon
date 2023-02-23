import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B_2748 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(str);

        long[] arr = new long[n+1];

        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i < arr.length; i ++){

            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(arr[arr.length-1]);
    }
    
}
