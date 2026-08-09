class SmallestOddAtEvenIndices{
    public static void main(String [] args){

        int[] arr = {17, 8, 25, 14, 9, 22, 31, 6};

        int smallest = arr[0];

        for(int i = 0; i < arr.length; i++){

            if(i % 2 == 0 && arr[i] % 2 != 0){
                if(arr[i] < smallest){
                    smallest = arr[i];
                }

            }
        }
        System.out.println(smallest);
    }
}