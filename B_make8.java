import java.io.*;
import java.util.*;

public class B_make8{

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        long N = Integer.parseInt(st.nextToken());
        long M = Integer.parseInt(st.nextToken());
        int cnt = 1888888888;
        int newcnt = 0;
        for(long i = N; i <= M; i ++){ 
            if(i % 8 == 0){
                for(int j = 0; j <String.valueOf(i).length(); j++ ){
                    if(String.valueOf(i).charAt(j) == '8'){
                        
                        newcnt ++;
                    }                   
                }
                if(cnt > newcnt){
                    cnt = newcnt;
                }
                newcnt = 0;

            }else{
                continue;
            }

        }

        if(M < 18){
            System.out.println(0);
        }else{
            System.out.println(cnt);
        }
    }
    
}
