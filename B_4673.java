public class B_4673 {
    public static void main(String[] args){
        boolean[] arr = new boolean[10001];
    
        for(int i = 0; i < arr.length; i ++){
                   
            if(i < 10){

                arr[i+0+i] = true;    

            }else if(i >= 10){

                int result = i;
                String str = Integer.toString(i);

                for(int j = 0; j < str.length(); j ++){

                    result += str.charAt(j) - '0';
                }
                if(result < arr.length){

                    arr[result] = true;
                }else{

                    continue;
                }        
            }     
        }
        for(int i = 0; i < arr.length; i ++){

            if(arr[i] == false){
                
                System.out.println(i);

            }
        }   
    } 
}
