class SecondLargestEvenElement{
    public static void main(String [] args){

        int[] arr = {12, 45, 8, 60, 21, 32, 18};

        int Largest = -1;
        int SecondLargest = -1;

        for(int i = 0; i < arr.length; i++){

            if( arr[i] % 2 == 0  && arr[i] > Largest){
                int temp = Largest;
                Largest = arr[i];
                SecondLargest = temp;
            }
            if(arr[i] % 2 == 0 && arr[i] < Largest && arr[i] > SecondLargest){
                SecondLargest = arr[i];
            }
        }
         System.out.println(SecondLargest);
    }
}