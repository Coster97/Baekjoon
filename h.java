import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class h {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String toUpper = str.toUpperCase();
        
        int howmany = 0;
        for(int i = 0; i < str.length(); i ++){
            int alp = toUpper.charAt(i) - '0' + 48;
            if(alp <= 67 ){
                howmany += 3;
            }else if(alp <= 70){
                howmany += 4;
            }else if(alp <= 73){
                howmany += 5;
            }else if(alp <= 76){
                howmany += 6;
            }else if(alp <= 79){
                howmany += 7;
            }else if(alp <= 83){
                howmany += 8;
            }else if(alp <= 86){
                howmany += 9;
            }else if(alp <= 90){
                howmany += 10;
            }
            
        }
        System.out.println(howmany);
         
    }
}
