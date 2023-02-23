import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class whyrano  {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long NCopy = N;
        long cnt = 0L;

        int[] arr = {5,2};
        

        loop: for(int i = 0 ; i < arr.length; i ++){
            if(N == 1 || N ==3){
                System.out.println(-1);
                break ;
            }   
            if(N % 5 == 0){
                while(true){
                    NCopy -= 5;
                    cnt ++;
                    //System.out.println("5로 카운트 중: "+cnt);
                    if(NCopy == 0){
                        System.out.println(cnt);
                        break loop;
                    }
                }
            }
            else if(N % 2 == 0 && N < 10){
                while(true){
                    NCopy -= 2;
                    cnt ++;
                    //System.out.println("5로 카운트 중: "+cnt);
                    if(NCopy == 0){
                        System.out.println(cnt);
                        break loop;
                    }
                }
            }
            if(N%5 != 0){
                while(true){
                    if(NCopy % 5 == 0){
                        NCopy -= 5;
                        cnt ++;
                        //System.out.println("5 뺴서 만드는중 : "+NCopy);
                        if(NCopy == 0){
                            System.out.println(cnt);
                            break loop;
                        }                 
                        
                    }else{
                        NCopy -= 2;
                        cnt ++;
                        
                        //System.out.println("2빼서 만드는 중 : "+NCopy);

                    }  
                }
            }
        }    
        
    } 
}
