import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_18870 {


    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int length = Integer.parseInt(str);

        int arr[] = new int[length];
        int ansNew[][] = new int[length][2];
        
        String str2 = br.readLine();
        StringTokenizer st = new StringTokenizer(str2, " ");

        for(int i = 0 ; i < arr.length; i ++){
            arr[i] = Integer.parseInt(st.nextToken());
             
        }

        int arr2[] = Arrays.copyOf(arr, length);
        
        Arrays.sort(arr);
        int index = 0;

        for(int i = 1 ; i < ansNew.length; i ++){
            if(arr[i] != arr[i - 1] ){
                ansNew[i-1][0] = index;
                ansNew[i-1][1] = arr[i-1];
                index ++;
              
            }else{
                ansNew[i-1][0] = index;
                ansNew[i-1][1] = arr[i-1];
                ansNew[i][0] = index;
                ansNew[i][1] = arr[i];
            }
        }
        
       
        for(int i = 0 ; i < arr2.length; i ++){
            for(int j = 0 ; j < ansNew.length; j ++){
                if(arr2[i] == ansNew[j][1]){
                    sb.append(ansNew[j][0] + " ");
                    break;
                }
            }
        }
        System.out.println(sb);
    }   
}
