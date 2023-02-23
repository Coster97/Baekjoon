import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_13305 {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());

        String distance = br.readLine();
        StringTokenizer st = new StringTokenizer(distance, " ");

        int[] disArr = new int[TC-1];
        for(int i = 0 ; i < disArr.length; i ++ ){
            disArr[i] = Integer.parseInt(st.nextToken());

        }

        String oil = br.readLine();
        StringTokenizer st2 = new StringTokenizer(oil, " ");

        int[] oilArr = new int[TC];
        for(int i = 0 ; i < oilArr.length; i ++ ){
            oilArr[i] = Integer.parseInt(st2.nextToken());

        }


        long sum = 0;
        int min = oilArr[0];
      
        //System.out.println("기름 제일 싼 곳 : "+min);

        for(int i = 0 ; i < oilArr.length-1; i ++){

            
            for(int j = 0 ; j < oilArr.length; j ++){
                if(oilArr[0]>oilArr[j]){
                    min =  j;
                    for(int k = j ; k < oilArr.length; k ++){
                        if(min>oilArr[j]){
                            min =  j;
                        
                        }
                    }
                
                
                }else{
                    min = 0;
                }
            }
           
           //System.out.println("기름 제일 싼 곳 : "+min);
            if(oilArr[i] == oilArr[min]){
                
                long dissum = 0;
                for(int j = min; j < disArr.length; j ++ ){
                    dissum += disArr[j];
                   
                 
                    
                }
              
                sum += dissum * oilArr[min];
                System.out.println(sum);

                break;

            }
            if(oilArr[i] >= oilArr[i + 1]){
                sum += disArr[i] * oilArr[i];
                //System.out.println("이 다음 도시 기름이 더 싸니까 거기 갈 기름만 넣을게 가격은 :"+ sum);
            }else if(oilArr[i] <= oilArr[i + 1]){
        
                
                long dissum2 = 0;
                for(int j = i; j < disArr.length-1; j ++){
                   
                    dissum2 += disArr[j];
            
                    if(j > min){
                        sum += dissum2 * oilArr[i];
                        //System.out.println("이 다음 도시 기름이 젤 싸 여기서는 이 가격만큼만 넣을게 :"+ sum);
                       
                        break;
                    }
                }
                         
            }
           
        }
        
    }
    
}
