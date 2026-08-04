class PrintMultiplesOfX{
    public static void main(String [] args){

        int[] arr = {18, 25, 30, 42, 45, 50, 63};
        int x = 9;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % x == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}