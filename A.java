import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A {

    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        int N;

        while(true){
            str = br.readLine();
            N = Integer.parseInt(str);
           
            if(N == 0){
                bw.flush();
                break;
            }
            boolean[] bArr = new boolean[(2*N)+1];
            bArr[0] = bArr[1] = true;

            int Cnt = 0;

            for(int i = 2; i <= Math.sqrt(N*2); i ++){
                for(int j=2; j<=N*2/i; j++) {
					if(bArr[i*j] == true) {
						continue;
					}
					else  {
						bArr[i*j] = true;
					}
			    }	
            }
            for(int j = N + 1; j <= N*2; j ++){
                if(bArr[j] == false){
                    Cnt += 1;
                }
            }
            //System.out.println(Cnt+"\n");
            bw.write(Cnt + "\n");
        }
    }
}
