import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_10810 {

    public static  void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];


        while(true){
            M --;
            if(M < 0){
                break;
            }

            String str2 = br.readLine();
            StringTokenizer st2 = new StringTokenizer(str2, " ");

            int start = Integer.parseInt(st2.nextToken());
            int end = Integer.parseInt(st2.nextToken());
            int value = Integer.parseInt(st2.nextToken());

           
            for(int i = start-1 ; i <= end-1 ; i ++){
                arr[i] =  value;
            } 
         

        }  

        for(int i = 0 ; i < arr.length; i ++){
            System.out.print(arr[i] + " ");
        }
      


    }
    
}
