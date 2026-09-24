class Arrrrev{

    // Given an integer array, return the largest element
    public static void main(String [] args){
        
        int [] arr = {7, 2, 9, 4, 1};

        int max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if( arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}