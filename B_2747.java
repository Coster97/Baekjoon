import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2747 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int length = Integer.parseInt(str);

        int[] arr = new int[length+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i < length+1; i ++){

            arr[i] = arr[i-2] + arr[i-1];
        }
        System.out.println(arr[length]);

    }
    
}
