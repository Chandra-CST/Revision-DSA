class smallestEven{
    public static void main(String [] args){

        int[] arr = {14, 8, 20, 6, 18};

        int smallestEven = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0 && arr[i] < smallestEven){
                smallestEven = arr[i];
            }
        }
        System.out.println(smallestEven);
    }
}