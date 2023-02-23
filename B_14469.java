import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class B_14469 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for(int i = 0 ; i < arr.length; i ++){

            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

       

        Arrays.sort(arr, (o1,o2) -> {
           
            return Integer.compare(o1[0], o2[0]);
            

        });
        System.out.println(Arrays.deepToString(arr));

        int preS = arr[0][0];
        int preE = arr[0][1];
        int sum = preS + preE;
        for(int i = 1 ; i < arr.length; i ++){
            if(i == 1){
                if(sum <= arr[i][0]){
                    
                    // System.out.println("나 들어려고 한 시간 : "+ arr[i][0]);
                    // System.out.println("내 앞 소 이떄 나옴 : "+ sum);
                    // System.out.println("나 두번쨰 타자 바로 입장 가능함 : "+sum);
                    preE = arr[i][0] + arr[i][1];
                    sum = preE;
                }else{
                   
                    // System.out.println("나 들어려고 한 시간 : "+ arr[i][0]);
                    // System.out.println("내 앞 소 이떄 나옴 : "+ sum);
                    // System.out.println("좀 기다려 : "+sum);
                    preE = sum + arr[i][1];
                    sum = preE;
                }
            
            }else{
                if(preE <= arr[i][0]){
                    
                    // System.out.println("나 들어려고 한 시간 : "+ arr[i][0]);
                    // System.out.println("내 앞 소 이때 나옴 : "+ sum);
                    // System.out.println("두번쨰 타자는 아닌데 바로 입장 가능함 : "+sum);
                    preE = arr[i][0] + arr[i][1];
                    sum = preE;
                }else{
                   
                    // System.out.println("나 들어려고 한 시간 : "+ arr[i][0]);
                    // System.out.println("내 앞 소 이떄 나옴 : "+ sum);
                    // System.out.println("좀 기다려 : "+sum);
                    preE = preE+ arr[i][1];
                    sum = preE;
                }   
        
            }
        }

        //System.out.println(cnt);
        System.out.println(sum);


    }
}