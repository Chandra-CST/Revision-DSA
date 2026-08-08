class smallestEven{
    public static void main(String [] args){

        int[] arr = {14, 8, 20, 6, 18};

        boolean foundEven = false;

        int smallestEven = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0 && arr[i] < smallestEven){
                smallestEven = arr[i];
                foundEven = true;
            }
        }

        if(foundEven){
            System.out.println(smallestEven);
        } else {
            System.out.println("No even element found");
        }
    }
}