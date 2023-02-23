import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_24416 {
    static int cnt;
    static int[] arr;
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int N = Integer.parseInt(str);
        arr = new int[N];

        System.out.print(fibo1(N) + " ");
        fibo2(N);


     

    }
    public static int fibo1(int n){
        cnt ++;

       if(n == 1 || n == 2){
        return 1;
       }else{
        return (fibo1(n-1) + fibo1(n-2));
       }
        

    }
    public static void fibo2(int n){

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        
        cnt = 1;
        for(int i = 3 ; i < n ; i ++){


            arr[i] = arr[i - 1] + arr[i -2];
            cnt ++;

        }
        System.out.print(cnt);
       
        

    }
    
}
