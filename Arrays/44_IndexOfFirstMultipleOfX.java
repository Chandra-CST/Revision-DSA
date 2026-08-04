class IndexOfFirstMultipleOfX{
    public static void main(String [] args){

        int[] arr = {7, 10, 14, 21, 28, 35};
        int x = 7;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % x == 0){
                System.out.println(i);
                break;
            }
        }
    }
}