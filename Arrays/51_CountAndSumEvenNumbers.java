class CountAndSumEvenNumbers{
    public static void main(String [] args){

        // Count the even numbers and find their sum

        int[] arr = {12, 7, 18, 9, 24, 15, 30};

        int sum = 0;
        int count = 0;

        for(int i = 0; i < arr.length ; i++){
            if(arr[i] % 2 == 0){
                sum += arr[i];
                count++;
            }
        }
        System.out.println(sum);
        System.out.println(count);
    }
}