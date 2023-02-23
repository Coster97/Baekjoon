import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2477 {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int fruit = Integer.parseInt(str);

        int[] arr = new int[6];
        int maxX = 0;
        int maxY = 0;
        for(int i = 0 ; i < 6; i ++){

            String str2 = br.readLine();
            StringTokenizer st = new StringTokenizer(str2, " ");

            int direction = Integer.parseInt(st.nextToken());
            int length = Integer.parseInt(st.nextToken());
            arr[i] = length;
            if(direction == 1 || direction == 2){
                if(maxX < length){
                    maxX = length;
                }
            }
            if(direction == 3 || direction == 4){
                if(maxY < length){
                    maxY = length;
                }
            }

        }

        int sum = 0;
       
        for(int i = 0 ; i < 5; i ++){

            sum += arr[i] * arr[i + 1];

        }


        sum += arr[arr.length-1]*arr[0];
        int max = (maxX * maxY) * 2;
        System.out.println((sum-max)*fruit);
        
    } 
    
}
