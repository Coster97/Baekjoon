import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class B_1931 {

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        int[][] arr = new int[N][2];
              
        for(int i = 0 ; i < arr.length; i ++){
            String str2 = br.readLine();
            StringTokenizer st = new StringTokenizer(str2, " ");
            arr[i][0] = Integer.parseInt(st.nextToken()); 
            arr[i][1] = Integer.parseInt(st.nextToken()); 
        }  
        
        Arrays.sort(arr, (o1, o2) -> {
            
            if(o1[1] == o2[1]){
                return Integer.compare(o1[0], o2[0]);
            }else {
                return Integer.compare(o1[1], o2[1]);
                
            }
            
        });

        int preStart = 0;
        int preEnd = 0;
        int cnt = 0;

        for(int i = 0 ; i < arr.length; i ++){
            if(i == 0){
                preStart = arr[i][0];
                preEnd = arr[i][1];
                cnt ++;
            }
           
            else if(i >= 1){
               
                if(arr[i][0]>= preEnd){
                    cnt ++;
                    preEnd = arr[i][1];
                }else if(arr[i][0] != preEnd && arr[i][1] == preStart){
                    cnt ++;
                    preEnd = arr[i][1];

                }
                else{
                    continue;
                }
            }
        
        }
        System.out.println(cnt);

    }
    
}
