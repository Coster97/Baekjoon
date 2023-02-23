import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;


public class f {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String toUpper = str.toUpperCase();
        char[] alp = new char[26];
        int[] most = new int[alp.length];
        int max = 0;

        for(int k = 0; k < alp.length; k ++){    
            alp[k] = (char)(65+k);
            for(int i = 0; i < str.length(); i ++){
                if(alp[k] == toUpper.charAt(i)){
                    most[k] += 1;
                    if(max < most[k]){
                        max = k;
                    }
                }

            }
                
            }     
        Arrays.sort(most);
        if(most[most.length-1] == most[most.length-2]){
            bw.write("?");
        }else{
            bw.write(alp[max]);
        } 
        br.close();
        bw.flush(); 
        bw.close();
            
    } 
}