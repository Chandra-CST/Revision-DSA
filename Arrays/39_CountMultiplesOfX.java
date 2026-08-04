class CountMultiplesOfX{
    public static void main(String [] args){

        int[] arr = {12, 15, 20, 27, 30, 35, 40};

        int count = 0;
        int x = 4;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % x == 0){
                count++;
            }
        }
        System.out.print(count);
    }
}