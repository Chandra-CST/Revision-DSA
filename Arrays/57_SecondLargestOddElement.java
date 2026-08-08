class SecondLargestOddElement{
    public static void main(String [] args){

        int[] arr = {15, 8, 27, 41, 33, 12, 19};

        int largest = -1;

        int secondLargest = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0 && arr[i] > largest){
                int temp = largest;
                largest = arr[i];
                secondLargest = temp;
            }
        }
        System.out.println(secondLargest);
    }
}