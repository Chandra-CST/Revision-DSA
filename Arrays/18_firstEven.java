// Find the First Even Element :

class firstEven{
    public static void main(String [] args){

        int[] arr = {11, 15, 7, 8, 9, 12, 14};

        for(int i = 0; i < arr.length; i++){
            if( arr[i] % 2 == 0){
                System.out.print(arr[i]);
                break;
            }
        }
    }
}