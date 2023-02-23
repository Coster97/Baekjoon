import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B_9506 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        while(true){

            arr.clear();
            int TC = Integer.parseInt(br.readLine());
            int sum = 0;
            if(TC == -1){
                break;
            }
            for(int i = 1; i < TC; i ++){
                if(TC%i == 0){
                    arr.add(i);
                    sum += i;
                }else{
                    continue;
                }
            }
            if(sum == TC){
                System.out.print(TC + " = ");
                for(int i = 0; i < arr.size(); i ++){
                  

                    if(i == arr.size()-1){
                        System.out.print(arr.get(i));
                    }else{
                        System.out.print(arr.get(i) + " + ");
                    }


                }
              
            }else{
                System.out.print(TC + " is " + "NOT perfect.");
            }
            System.out.println();

        }


        
    }
}
