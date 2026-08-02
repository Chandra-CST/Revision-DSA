// Find the First Odd Element : 

class FirstOdd{
    public static void main(String [] args){
        
        int[] arr = {10, 18, 6, 9, 14, 21};

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                System.out.print(arr[i]);
                break;
            }
        }
    }
}