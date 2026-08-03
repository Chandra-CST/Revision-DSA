class MaxMinDifference{
    public static void main(String [] args){

        int[] arr = {12, 45, 8, 91, 34, 67};

        int largest = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        int Smallest = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < Smallest){
                Smallest = arr[i];
            }
        }
        System.out.println("Largest : " + largest);
        System.out.println("Smallest : " + Smallest);
        System.out.println("The difference between Max and Min Element is : " + (largest - Smallest));
    }
}