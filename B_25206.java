import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B_25206 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //float[] arr = new float[20];
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0 ; i < 2; i ++){

            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            String name = st.nextToken();
            String score = st.nextToken();
            String grade = st.nextToken();
         
           
            if(grade != "P"){
                System.out.println(grade);
                arr.add(score);
            }else{
                System.out.println("d");
    
            }

        }
        System.out.println(arr.toString());
       

    }
    
}
