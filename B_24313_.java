// // import java.util.Scanner;

// // public class B_24313_ {
    
// //     public static void main(String[] args) {

// //         Scanner sc = new Scanner(System.in);

// //         double a1 = sc.nextDouble();
// //         double a0 = sc.nextDouble();
// //         double c = sc.nextDouble();
// //         double n0 = sc.nextDouble();

// //         if (a1 / (c - a0) <= n0) {
// //             System.out.println(1);
// //         } else {
// //             System.out.println(0);
// //         }

// //         sc.close();
// //     }
// // }


// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a1 = sc.nextInt();
//         int a0 = sc.nextInt();
//         int c = sc.nextInt();
//         int n0 = sc.nextInt();

//         boolean tf = false;
//         for (int i = n0; i <= 100; i++) {
//             int fn = a1 * i + a0;
//             int gn = i;

//             if (fn <= c * gn) {
                
//             } else {
//                tf = true;
//                 break;
//             }
//         }

//         if (tf) {
//             System.out.println(0);
//         } else {
//             System.out.println(1);
//         }

//         sc.close();
//     }
// }


// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.StringTokenizer;

// class Main{
//     public static void main(String[] args)throws IOException{

//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         String str = br.readLine();
//         StringTokenizer st = new StringTokenizer(str, " ");

//         int a1 = Integer.parseInt(st.nextToken());
//         int a0 = Integer.parseInt(st.nextToken());

//         int c = Integer.parseInt(br.readLine());
//         int n = Integer.parseInt(br.readLine());

//         boolean tf = true;
       
//             for(int i = n; i <= 100; i ++){

//                 int fn = a1 * n + a0;
//                 int gn = i;

//                 if (fn <= c * gn) {
//                     tf = true;
//                 } else {
//                     tf = false;
//                     break;
//                 }
//             }
//             if(tf)
//             {
//                 System.out.println(1);
//             }
//             else
//             {
//                 System.out.println(0);
//             }

//     }

// }


import java.util.*;

public class B_24313_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();

        boolean tf = false;
        for (int i = n0; i <= 100; i++) {
            int fn = a1 * i + a0;
            int gn = i;

            if (fn <= c * gn) {
                
            } else {
               tf = true;
                break;
            }
        }

        if (tf) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }

        sc.close();
    }
}