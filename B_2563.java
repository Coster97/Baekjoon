import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class B_2563{

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];
        int[][] copyArr = new int[N][2];

        for(int i = 0 ; i < N; i ++){

            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            copyArr[i][0] =  arr[i][0] + 10;
            copyArr[i][1] =  arr[i][1] + 10;

        }

        Arrays.sort(arr, (o1, o2) -> {
        
            if(o1[0] == o2[0]){
                return o1[1] - o2[1];
            }else{
                return o1[0] - o2[0]; 
            }
            
        });
        Arrays.sort(copyArr, (o1, o2) -> {
        
            if(o1[0] == o2[0]){
                return o1[1] - o2[1];
            }else{
                return o1[0] - o2[0]; 
            }
            
        });

        int ver = 0;
        int aln = 0;
        int sum = 0;
        int start = 0;

        for(int i = 0 ; i < arr.length-1; i ++){
            sum = 0;
           
            for(int j = start; j < copyArr.length-1; j ++){

                if(arr[i][0] != arr[i + 1][0] && arr[i+1][0] < copyArr[j][0]){
                    ver = copyArr[j][0] - arr[i+1][0];
                    aln = copyArr[j+1][1] - arr[i][1];
                    sum += ver*aln;
                    System.out.println("ver : "+ver);
                    System.out.println("aln : "+aln);
                    break;
                } if(arr[i][0] == arr[i + 1][0] && arr[i][1] < arr[i+1][1]){
                    ver = 10;
                    aln = copyArr[j][1] - arr[i+1][1];
                    sum += ver*aln;
                    System.out.println("ver : "+ver);
                    System.out.println("aln : "+aln);
                    break;
                }else{
                    break;
                }


            }
            start += 1;
        }


        System.out.println((100*N)-sum);
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(copyArr));
      

    }
}