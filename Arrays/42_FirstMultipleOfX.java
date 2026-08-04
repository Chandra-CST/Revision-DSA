class FirstMultipleOfX{
    public static void main(String [] args){

        int[] arr = {11, 14, 22, 35, 44, 50};
        int x = 11;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % x == 0){
                System.out.print(arr[i]);
                break;
            }
        }
    }
}