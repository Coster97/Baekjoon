import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_1026 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        int[] A = new int[N];
        int[] B = new int[N];
       


        String str2 = br.readLine();
        StringTokenizer st = new StringTokenizer(str2, " ");
        String str3 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(str3, " ");


        for(int i = 0; i < A.length; i ++){
            
            A[i] = Integer.parseInt(st.nextToken());
          
        }
       
        for(int i = 0; i < B.length; i ++){
            

            B[i] =  Integer.parseInt(st2.nextToken());
    
          
        }
        int[] newB = B.clone();
        Arrays.sort(A);
        Arrays.sort(newB);

        int sum = 0;
        int last = newB.length -1;

        for(int i = 0; i < newB.length; i ++){
            sum += A[i] * newB[last];
            last --;
        }
   

        System.out.println(sum);



        


    }
    
}
