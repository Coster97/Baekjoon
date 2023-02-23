import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class B_10812 {

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 1; i <= N; i ++){
            arr.add(i);

        }

        for(int i = 0; i < M; i ++){
            String str2 = br.readLine();
            StringTokenizer st2 = new StringTokenizer(str2, " ");
            int A = Integer.parseInt(st2.nextToken());
            int B = Integer.parseInt(st2.nextToken());
            int C = Integer.parseInt(st2.nextToken());
            int cnt = B-C + 1;
            for(int j = 0; j < cnt; j ++){

               
                int start = C;
                int end = A;
                while(true){

                    if(start == end){
                        break;
                    }
                    Collections.swap(arr, start-1, start-2);
                    start --;

                }
                C ++;
                A ++;

            }
           
        }
        for(int i = 0 ; i < arr.size(); i ++){
            System.out.print(arr.get(i) + " ");
        }
        
    }
}
