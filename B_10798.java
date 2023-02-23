import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10798 {

    public static void main(String[] args)throws IOException{

        String[] arr = new String[5];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0 ; i < 5; i ++){

          
            arr[i] = br.readLine();

        }

        int max = 0;

        for(int i = 0 ; i < 5; i ++){
            if(arr[i].length() > max){
                max = arr[i].length();
            }
        }
      
        int start = 0;
        while(true){
            if(start == max){
                break;
            }
            
            for(int i = start; i < start+1; i ++){
            
                System.out.println("현재 0인덱스" + start);
                if(start == arr[0].length()){
                    break;
                }
                System.out.print(arr[0].charAt(i));
                start ++;;
                


            }
            for(int i = start; i < start+1; i ++){
                System.out.println("현재 1인덱스" + start);
                if(start == arr[1].length()){
                    break;
                }
                System.out.print(arr[1].charAt(i));
                start ++;;
                


            }
            for(int i = start; i < start+1; i ++){
                System.out.println("현재 2인덱스" + start);
                if(start == arr[2].length()){
                    break;
                }
                System.out.print(arr[2].charAt(i));
                start ++;;
                


            }
            for(int i = start; i < start+1; i ++){
                System.out.println("현재 3인덱스" + start);
                if(start == arr[3].length()){
                    break;
                }
                System.out.print(arr[3].charAt(i));
                start ++;;
                


            }
            for(int i = start; i < start+1; i ++){
                System.out.println("현재 4인덱스" + start);
                if(start == arr[4].length()){
                    break;
                }
                System.out.print(arr[4].charAt(i));
                start ++;;
                


            }

            
        }
    }
    
}
