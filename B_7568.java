import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_7568 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int testCase = Integer.parseInt(str);
        int[][] arr = new int[testCase][2];
        int[] score = new int[testCase];

        for(int i = 0; i < testCase; i ++){

            String str2 = br.readLine();
            score[i] = 1;
            
            for(int j = 0; j < 2-1; j ++){
                StringTokenizer st2 = new StringTokenizer(str2, " ");
                arr[i][j] = Integer.parseInt(st2.nextToken());
                arr[i][j + 1] = Integer.parseInt(st2.nextToken());

            }

        }
        
        for(int i = 0; i < arr.length-1; i ++){

            for(int j = i+1; j < arr.length; j ++){

                if(arr[i][0] > arr[j][0] && arr[i][1] > arr[j][1]){
                    score[j] ++;
                }else if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    score[i] ++;
                }else{
    
                }

            }
            
        }
        for(int i = 0 ; i < score.length; i ++){

            System.out.print(score[i] + " ");

        }
       
    }
    
}
