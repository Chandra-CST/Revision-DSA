class LargestOddElementAtEvenIndices{
    public static void main(String [] args){

        int[] arr = {11, 8, 27, 14, 19, 6, 31, 20};
        
        int largest = 0;

        boolean foundOdd = false;

        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0 && arr[i] % 2 != 0){
                if(!foundOdd){
                largest = arr[i];
                foundOdd = true;
            }
            else if(arr[i] > largest){
                largest = arr[i];
            }
            }
        }
        System.out.println(largest);
    }
}