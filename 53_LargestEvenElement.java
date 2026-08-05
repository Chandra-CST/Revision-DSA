class LargestEvenElement{
    public static void main(String [] args){

        // Find the largest even element.

        int[] arr = {13, 8, 21, 42, 17, 30, 9};

        int LargestEven = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0 && arr[i] > LargestEven){
                LargestEven = arr[i];
            }
        }
        System.out.println(LargestEven);
    }
}