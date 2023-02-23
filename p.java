import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int[] arr = new int[A+1];
        for(int i = 2; i <= A; i ++){
            arr[0] = 0;
            arr[1] = 1;
            arr[i] = arr[i-1] + arr[i-2];
        }
        if(A == 1){
            System.out.println(1);
            return;
        }
        System.out.println(arr[A]); 
    } 
}
