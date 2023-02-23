import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2862 {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        String Amin = String.valueOf(A);
        String Bmin = String.valueOf(B);
        String Amax = String.valueOf(A);
        String Bmax = String.valueOf(B);

        for(int i = 0 ; i < Amin.length(); i ++){
            if(Amin.charAt(i) == '6'){
                Amin = Amin.substring(0, i) + '5' + Amin.substring(i + 1);
            }
            if(Amax.charAt(i) == '5'){
                Amax = Amax.substring(0, i) + '6' + Amin.substring(i + 1);
            }
        }
        for(int i = 0 ; i < Bmin.length(); i ++){
            if(Bmin.charAt(i) == '6'){
                Bmin = Bmin.substring(0, i) + '5' + Bmin.substring(i + 1);
            }
            if(Bmax.charAt(i) == '5'){
                Bmax = Bmax.substring(0, i) + '6' + Bmin.substring(i + 1);
            }
        }
       
       
        System.out.print(Integer.parseInt(Amin) + Integer.parseInt(Bmin) + " ");
        System.out.print(Integer.parseInt(Amax) + Integer.parseInt(Bmax) + " ");

    }
    
}
