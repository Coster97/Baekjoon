import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_1049 {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int line = Integer.parseInt(st.nextToken());
        int brand = Integer.parseInt(st.nextToken());

        int[] packageArr = new int[brand];
        int[] eachArr = new int[brand];

        for(int i = 0; i < brand; i ++){
            String str2 = br.readLine();
            StringTokenizer st2 = new StringTokenizer(str2, " ");
            packageArr[i] = Integer.parseInt(st2.nextToken());
            eachArr[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(packageArr);
        Arrays.sort(eachArr);
    
        int allPack = 0;
        int mix = 0;
        int each = 0;

        if(line/6 != 0 && line%6 != 0){
 
            allPack += packageArr[0] * (line/6 + 1);
            mix += (packageArr[0] * (line/6)) + (eachArr[0]*(line%6));
            each += eachArr[0] * line;
        }else if(line/6 != 0 && line%6 == 0){

            allPack += packageArr[0] * (line/6);
            mix += eachArr[0] * line;
            each += eachArr[0] * line;
        }
        if(line/6 == 0 && line <= 6){

            allPack += packageArr[0];
            mix += (packageArr[0] * line/6) + (line%6);
            each += eachArr[0] * line;
        }
        
        int[] result = {allPack, mix, each};
        Arrays.sort(result);
        System.out.println(result[0]);

      
    }
    
}
