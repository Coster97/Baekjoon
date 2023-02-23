import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;



public class B_11497 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int TC = Integer.parseInt(br.readLine());
        
        for(int i = 0 ; i < TC; i ++){
          
            String length = br.readLine();
            int tree = Integer.parseInt(length);
         
            ArrayList<Integer> arr = new ArrayList<>(tree);
            arr.clear();
            String height = br.readLine();
            StringTokenizer st = new StringTokenizer(height, " ");
            for(int j = 0; j < tree; j ++){
                arr.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(arr);

            int[] result = new int[tree];
            int start = 0;
            int end = tree -1;
            
            result[tree/2] = arr.get(tree-1);
            for(int j = 0 ; j < result.length-1; j +=2){
                result[start] = arr.get(j);
                result[end] = arr.get(j + 1);
                start ++;
                end --;

            }
            int max = Math.abs(result[0]-result[tree-1]);
            for(int j = 0 ; j < result.length -1; j ++){
                if(Math.abs(result[j] - result[j + 1]) > max){
                    max = Math.abs(result[j] - result[j + 1]) ;
                }
            }
            sb.append(max + "\n");
          
        }
        System.out.println(sb);
    }
}
