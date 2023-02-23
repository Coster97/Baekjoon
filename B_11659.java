import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_11659 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int[] arrsum = new int[N];


        String str2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(str2, " ");

        for(int i = 0 ; i < arr.length; i ++){
            arr[i] = Integer.parseInt(st2.nextToken());
         

        }
    
        arrsum[0] = arr[0];
		for (int i = 1; i < arrsum.length; i++) {
            
			arrsum[i] = arrsum[i-1] + arr[i];
            
		}
        for(int i = 0 ; i < M; i ++){
            String str3 = br.readLine();
            StringTokenizer st3 = new StringTokenizer(str3, " ");
            int start = Integer.parseInt(st3.nextToken());
            int end = Integer.parseInt(st3.nextToken());
           
            if(start != 1){
                sb.append(arrsum[end-1]-arrsum[start-2]+"\n");
               
            }else{
                sb.append(arrsum[end-1]+"\n");
            }
        }
        System.out.println(sb);
       
    }
    
}
