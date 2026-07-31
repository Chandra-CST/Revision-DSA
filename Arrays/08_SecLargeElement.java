class SecLargeElement{
    public static void main(String [] args){
        int [] arr = {2,4,54,6,17,8,16};

        int largest = arr[0];
        int SecondLargest = arr[0];
        int current;

        for(int i = 1; i < arr.length; i++){
            current = arr[i];

         if(current > largest ){
            int temp = largest;
            largest = current;
            SecondLargest = temp;
            }
            else if(SecondLargest < current && current < largest){
                SecondLargest = current;
            }
        }
    }
}
    