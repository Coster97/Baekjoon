import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class B_11399 {
    
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);

        int[] arr = new int[N];

        String str2 = br.readLine();
        StringTokenizer st = new StringTokenizer(str2, " ");

        for(int i = 0 ; i < arr.length; i ++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int min = 0;
        int sum = 0;
        int result = 0 ;
        int arrnew[] = arr.clone();
        Arrays.sort(arrnew);

        for(int i = 0; i < arrnew.length; i ++){
            for(int j = 0 ; j < arr.length; j ++){

                if(arrnew[i] == arr[j]){
                    min = j;
                    sum = arr[j] + sum;
                    result += sum;
                    break;
                }

            }
        }
        System.out.println(result);
    }
    
}
