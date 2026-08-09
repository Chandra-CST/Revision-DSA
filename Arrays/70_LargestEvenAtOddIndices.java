class LargestEvenAtOddIndices{
    public static void main(String [] args){

        int[] arr = {5, 12, 8, 25, 18, 42, 7, 30};

        int largest = 0;

        for(int i = 0; i < arr.length; i++){
            if(i % 2 != 0 && arr[i] % 2 == 0 && arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}