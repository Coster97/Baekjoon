import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

class B_1744{
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());

        PriorityQueue <Integer> P = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue <Integer> Z = new PriorityQueue<>();
        PriorityQueue <Integer> M = new PriorityQueue<>();

      

        for(int i = 0; i < TC; i ++){
          
            int value = Integer.parseInt(br.readLine());
            if(value > 0){
                P.add(value);
            }
            else if(value == 0){
                Z.add(value);
            }
            else if(value < 0){
                M.add(value);
            }
        }

    

        int sum = 0;
        while(!P.isEmpty()){
            if(P.size() == 1){
                sum += P.peek();
                P.poll();
                break;
            }else{
               
                int multy = P.peek();
                P.poll();
                if(multy == 1 || P.peek() == 1){
                    sum += P.peek() + multy;
                    P.poll();
                }else{
                    sum += P.peek() * multy;
                    P.poll();

                }
            }
        }
        
        while(!M.isEmpty()){
          
                if(M.size() >= 2){
                    int multy = M.peek();
                    M.poll();
                    sum += M.peek() * multy;
                    M.poll();   
                

                }
                else if(M.size() == 1){
                  
                    if(!Z.isEmpty()){
                        sum += Z.peek() * M.peek();
                        Z.poll();
                        M.poll();
                    }else{
                        sum += M.peek();
                        M.poll();
                    }
                 
                }
            
        }
        System.out.println(sum);

    }
}