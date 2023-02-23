import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_5545 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int topping = Integer.parseInt(br.readLine());

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int douPrice = Integer.parseInt(st.nextToken());
        int topPrice = Integer.parseInt(st.nextToken());

        int douKcal = Integer.parseInt(br.readLine());

        int[] toppingArr = new int[topping];
        for(int i = 0 ; i < topping; i ++){ 
            toppingArr[i] = Integer.parseInt(br.readLine());
        }

        int pizzaPrice = 0;
        int topKcal = douKcal;
        int cnt = 1;
        int max = douKcal/douPrice;

        Arrays.sort(toppingArr);
        for(int i = toppingArr.length-1 ; i >= 0; i --){

            pizzaPrice = douPrice + (topPrice*cnt);
          
            
            for(int j = toppingArr.length-1 ; j >= toppingArr.length -cnt; j --){
                // System.out.println("추가한 토핑 열량 : " + toppingArr[j]);
                topKcal += toppingArr[j];
                
            }
            if(max <topKcal/pizzaPrice ){
                max = topKcal/pizzaPrice;
            }
            // System.out.println("피자 가격: " + pizzaPrice);
            // System.out.println("총 열량: " + topKcal);
            // System.out.println("1원당 열량" + topKcal/pizzaPrice);
            // System.out.println("토핑 없을 떄 1원당 열량" + douKcal/pizzaPrice);
         
            cnt ++;
            topKcal = douKcal;;
        
           
        }
        


        // int pizzaPrice = douPrice + (topPrice*3);
        // int topKcal = douKcal + toppingArr[toppingArr.length-1] + toppingArr[toppingArr.length-2] + toppingArr[toppingArr.length-3];

        // System.out.println("도우 가격 : " + douPrice);
        // System.out.println("토핑 가격 : " + topPrice);
        // System.out.println("도우 칼로리 : " + douKcal);
        System.out.println(max);
     
        
    }
    
}
