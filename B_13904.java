import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B_13904{

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int TC = Integer.parseInt(br.readLine());
       
        int[][] arr = new int[TC][2];
        int[][] arrClone = arr.clone();
      // PriorityQueue<Integer> homework = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i < arr.length; i ++){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");


            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());

        }

        Arrays.sort(arrClone, (o1, o2) -> {
            return Integer.compare(o2[1], o1[1]);
        });
        Arrays.sort(arr, (o1, o2) -> {
            return Integer.compare(o2[0], o1[0]);
        });
        // for(int i = 0 ; i < arr.length ; i ++){
        //     homework.add(arrClone[i][1]);
        // }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(arrClone));
        //System.out.println(homework.toString());
     
        int day = arr[0][0]+1;
        int sum = 0;
        System.out.println(day);
        while(true){
            if(day == arr[arr.length-1][0]){
                break;
            }else{
                day --;
                for(int i = 0; i < arr.length; i ++){
                   
                    System.out.println("일단 실행됨");
        
                    if(arr[i][0] >= day){
                       
                        System.out.println("오늘은: " + day);
                        System.out.println("숙제 가능한 날짜임 : " + arr[i][0]);
                        for(int j = 0; j < arrClone.length; j ++){
                            if(arrClone[j][0] != 0){
                       
                                System.out.println("아직 이 숙제 안끝남 :" + arrClone[j][0]);
                                if(day <= arrClone[j][0] ){
                                   System.out.println("이 숙제 할거임 : "+ arrClone[j][0]);
                                    sum += arrClone[j][1];
                                    arrClone[j][0] = 0;
                                    System.out.println(Arrays.deepToString(arr));
                                    System.out.println(Arrays.deepToString(arrClone));
                                    System.out.println(sum);
                                    
                                    break;
                                }else{
                                   System.out.println("근데 이 숙제 못해 날짜가 안맞아:"+ arrClone[j][0]);
                                    continue;
                                }
        
                            }else{
                                System.out.println("이미 이 숙제 끝남 :" + arrClone[j][0]);
                                continue;
                            }
                           
                         
                        }
                       
                        
                    }
                    else{
                        //System.out.println("숙제 가능한 날짜아님");
                        
                    }
        
                    if(day == 0){
                      
                        break;
                    }
                    

            }
        }

        
            System.out.println(sum);

        }
        
        
       

    }
    
}

