class SumOfMultiplesOf5{
    public static void main(String [] args){

        int[] arr = {10, 7, 15, 22, 30, 9, 5};

        int count = 0;
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 5 == 0){
                count++;
                sum += arr[i];
            }
        }
        System.out.println(count);

        System.out.println(sum);
    }
}