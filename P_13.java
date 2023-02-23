import java.util.Scanner;

public class P_13 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //triangleLU(a);
        triangleRB(a);
        triangleRU(a);
       
    }
    public static void triangleLU(int n){
        for(int i = 0; i < n; i ++){
            for(int j = 0; j <= i; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void triangleRB(int n){
        for(int i = 0; i < n; i ++){
            for(int j = n-1; j >= 0; j --){
                for(int k = 0; k <= n; k++){
                    String space= " ";
                    String star = "*";
                    space.repeat(j);
                    star.repeat(k);
                    System.out.print(space + star);
                }

            }
            System.out.println();
        }

    }
    public static void triangleRU(int n){

    }
    
}
