class SecondLargestMultipleOfX{
    public static void main(String [] args){

        int[] arr = {15, 21, 30, 42, 60, 25, 55};
        int x = 5;

        int largest = -1;
        int secondLargest = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % x == 0 && arr[i] > largest){
                int temp = largest;
                largest = arr[i];
                secondLargest = temp;
            }
            if( arr[i] % x == 0 && arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}