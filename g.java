import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class g {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String toUpper = str.toUpperCase();
        int[] alp = new int[26];
        int max=0;
        char most = '?';

        for(int i = 0; i < toUpper.length(); i ++){
           alp[toUpper.charAt(i)-65] += 1;
        }
        for(int k = 0; k < alp.length; k ++){
            if(alp[k]>max){
                max = alp[k];              
                most = (char)(65+k);              
            }else if(max == alp[k]){
                most = '?';            
            }           
        }       
        System.out.println(most);
 
    } 
}