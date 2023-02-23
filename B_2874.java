import java.util.*;
import java.io.*;


class B_2874{



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        int[][] arr = new int[TC][2]; 

        int level = 1;

        for(int i = 0; i < TC; i ++){
            String str = br.readLine();
            arr[i][0] = level;
            arr[i][1] = Integer.parseInt(str);
            level ++;

        }
        Arrays.sort(arr, (o1, o2) -> {
            
            return Integer.compare(o2[0], o1[0]);
        });

        int sum = 0;

        for(int i = 0 ;i < arr.length-1; i ++){
            if(arr[i][1] <= arr[i+1][1]){
                while(true){
                    arr[i+1][1] --;
                    sum ++;
                    if(arr[i][1]>arr[i+1][1]){
                        break;
                    }
                }
            }
        }
        //System.out.println(Arrays.deepToString(arr));
        System.out.println(sum);

        
       

           
    }
}