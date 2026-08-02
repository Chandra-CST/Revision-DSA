class SumOfPos{
    public static void main(String [] args){

        int[] arr = {5, -3, 0, 7, -1, 0, 9, -6};

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                sum += arr[i];
            }
        }
        System.out.println("The sum of all Positive Numbers are : " + sum);
    }
}