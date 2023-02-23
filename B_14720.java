import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_14720 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());   
        
        int[] arr = new int[N];
        int[] milk = {0,1,2};

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        for(int i= 0; i < arr.length; i ++){
            arr[i] = Integer.parseInt(st.nextToken());

        }

        int start = 0;
        int cnt = 0;
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] == start){
                cnt ++;
                start ++;
                if(start == 3){
                    start = 0;
                }
            }else{
                continue;
            }
        }
        System.out.println(cnt);





    }

    
}
