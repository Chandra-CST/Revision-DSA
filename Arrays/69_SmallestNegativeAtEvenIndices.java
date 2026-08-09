class SmallestNegativeAtEvenIndices{
    public static void main(String [] args){

        int[] arr = {5, -12, -8, -20, 3, -7, -14, -15};

        int smallest = -1;

        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0 && arr[i] < 0 && arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }
}