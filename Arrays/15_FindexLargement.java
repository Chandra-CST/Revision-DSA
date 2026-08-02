//   Find the Index of the Largest Element :

class FindexLargelement{
    public static void main(String [] args){

        int[] arr = {12, 45, 8, 91, 34, 67};

        int current;
        int largestIndex = 0;
        int Largest = arr[0];

        for(int i = 1; i < arr.length; i++){
            current = arr[i];

            if(current > Largest){
                Largest = current;
                largestIndex = i;
            }
        }
        System.out.println("The index of the Largest element is : " + largestIndex);
    }
}