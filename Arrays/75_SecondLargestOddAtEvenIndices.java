class SecondLargestOddAtEvenIndices{
    public static void main(String [] args){

        int[] arr = {11, 8, 27, 14, 19, 6, 31, 20};

        int largest = -1;
        int secondLargest = -1;

        for(int i = 0; i < arr.length; i++){

            if(i % 2 == 0 && arr[i] % 2 != 0){

                if(arr[i] > largest){

                    int temp = largest;
                    largest = arr[i];
                    secondLargest = temp;

                }
                 else if(arr[i] < secondLargest){
                    secondLargest = arr[i];
            }
            }
        }
        System.out.println(secondLargest);
    }
}