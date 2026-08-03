class ReplaceNegative{
    public static void main(String [] args){

        int[] arr = {5, -3, 7, -1, 9, -8, 2};

        int zero = 0;

        for(int i = 0; i < arr.length; i++){
            if( arr[i] < 0){
                arr[i] = zero;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}