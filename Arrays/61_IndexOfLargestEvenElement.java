class IndexOfLargestEvenElement{
    public static void main(String [] args){

        int[] arr = {13, 22, 8, 40, 17, 18};

        int largest = -1;
        int largestIndex= -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0 && arr[i] > largest){
                largest = arr[i];
                largestIndex= i;
            }
        }
        System.out.println(largestIndex);
    }
}