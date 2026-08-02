//   Find the Index of the Smallest Element :
class FindexSmallement{
    public static void main(String [] args){

        int[] arr = {12, 45, 8, 91, 34, 67};

        int min = arr[0];

        int minIndex = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println("The index of the smallest element inside an array is : " + minIndex);
    }
}