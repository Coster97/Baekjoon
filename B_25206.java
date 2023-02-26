import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_25206 {
    public static void main(String[] args)throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        double cnt = 0;
        double sum = 0;
        double score = 0;
        boolean tf = false;

        for(int i = 0 ; i < 20; i ++){

            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            String A = st.nextToken();
            String B = st.nextToken();
            String C = st.nextToken();
            
            double myscore= Double.parseDouble(B);
            
            if(C.length() != 1 || C.equals("F")){
                
                    switch(C){
                        case "A+" : sum += myscore * 4.5;
                        break;

                        case "A0" : sum += myscore * 4.0;
                        break;

                        case "B+" : sum += myscore * 3.5;
                        break;

                        case "B0" : sum += myscore * 3.0;
                        break;

                        case "C+" : sum += myscore * 2.5;
                        break;

                        case "C0" : sum += myscore * 2.0;
                        break;

                        case "D+" : sum += myscore* 1.5;
                        break;

                        case "D0" : sum += myscore * 1.0;
                        break;

                        case "F" : sum += myscore * 0.0;
                        break;



                    }
                    score += myscore;
                    cnt ++;
                    tf = true;
                
            }else{
                continue;
            }
            
            
        }

        if(sum != 0){
            System.out.println(cnt);
            System.out.printf("%f", sum/score);

        }else{

            System.out.printf("%6f", sum);
        }
    }
}