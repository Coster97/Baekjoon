import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_16435 {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        String str2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(str2, " ");
        for(int i = 0 ; i < arr.length; i ++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(arr);

        int sum = 0;

        for(int i = 0 ; i < arr.length; i ++){

            if(arr[i] <= L){

                L += 1;
                if(i == arr.length-1){
                    System.out.println(L);
                    break;
                }
                
            }else if(arr[i] > L){
                System.out.println(L);
                break;
            }
            
           
        }
    }
    
}
