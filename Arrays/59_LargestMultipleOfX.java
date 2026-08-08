class LargestMultipleOfX{
    public static void main(String [] args){

        int[] arr = {15, 21, 30, 42, 60, 25};
        int x = 5;

        int largest = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % x == 0 && arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}