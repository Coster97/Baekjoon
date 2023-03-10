import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class B_10789{

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = new String[5];
        
        int length = 0;
        for(int i = 0 ; i < 5; i ++){

            String str = br.readLine();
            arr[i] = str;
            if(str.length() > length){
                length = str.length();
            }

        }

        int cnt = 1;
        int start = 0;
        while(true){
            if(cnt > length){
                break;
            }

            if(start<=arr[0].length()-1){
                for(int i = start; i < start+1; i ++){
                    System.out.print(arr[0].charAt(start));                
                }
            }
            if(start<=arr[1].length()-1){
                for(int i = start; i < start+1; i ++){
                    System.out.print(arr[1].charAt(start));                
                }
            }
            if(start<=arr[2].length()-1){
                for(int i = start; i < start+1; i ++){
                    System.out.print(arr[2].charAt(start));                
                }
            }
            if(start<=arr[3].length()-1){
                for(int i = start; i < start+1; i ++){
                    System.out.print(arr[3].charAt(start));                
                }
            }
            if(start<=arr[4].length()-1){
                for(int i = start; i < start+1; i ++){
                    System.out.print(arr[4].charAt(start));                
                }
            }
            
            cnt++;
            start++;

        }
    }
}