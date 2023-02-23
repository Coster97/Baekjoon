import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_2720 {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int TC = Integer.parseInt(br.readLine());
        double[] arr = {0.25,0.10,0.05,0.01};
        double[] arr2 = {0,0,0,0};
        int cnt = 0;
        int dol = 0;

        for(int i = 0 ; i < TC; i ++){
            int N = Integer.parseInt(br.readLine());
            for(int j = 0 ; j < arr.length; j ++){
                if(dol < N){
                    while(true){
                        dol += arr[j];
                        arr2[j] ++;
                        if(dol > N){
                            dol -= arr[j];
                            arr2[j] ++;
                            break;
                        }
                    }
                }else{
                    continue;
                }
                if(dol == N){
                    System.out.println(Arrays.toString(arr2));
                    Arrays.asList(arr2).clear();
                }
            }
        }

    }
    
}
