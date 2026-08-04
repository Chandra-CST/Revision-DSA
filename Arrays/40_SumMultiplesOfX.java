class SumMultiplesOfX{
    public static void main(String [] args){

        int[] arr = {12, 15, 20, 27, 30, 35, 40};
        
        int sum = 0;
        int x = 5;

        for(int i = 0; i < arr.length; i++){
            if( arr[i] % x == 0){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}