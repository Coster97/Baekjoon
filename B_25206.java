import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_25206 {
    public static void main(String[] args)throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        float cnt = 0;
        float sum = 0F;
        float score = 0F;
        boolean tf = false;

        for(int i = 0 ; i < 20; i ++){

            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            String A = st.nextToken();
            float B = Float.parseFloat(st.nextToken());
            String C = st.nextToken();
            
            if(C.length() != 1){
                if(C.charAt(1) != 0){
                    switch(C){
                        case "A+" : sum += B * 4.5;
                        break;

                        case "A0" : sum += B * 4.0;
                        break;

                        case "B+" : sum += B * 3.5;
                        break;

                        case "B0" : sum += B * 3.0;
                        break;

                        case "C+" : sum += B * 2.5;
                        break;

                        case "C0" : sum += B * 2.0;
                        break;

                        case "D+" : sum += B * 1.5;
                        break;

                        case "D0" : sum += B * 1.0;
                        break;



                    }
                    score += B;
                    cnt ++;
                    tf = true;
                }
            }else{
                continue;
            }
            
            
        }

        if(tf == false){
            System.out.printf("%6f",sum);
        }else{
            System.out.println(cnt);
            System.out.printf("%6f", sum/score);
        }

    }
}
