class SortedArray{
    public static void main(String [] args){

        int[] arr = {2, 5, 8, 11, 17, 20};
        
        boolean isSorted = true;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i + 1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted == true){
            System.out.println("The array is Sorted!");
        } else {
            System.out.println("The Array is not Sorted!");
        }
    }
}