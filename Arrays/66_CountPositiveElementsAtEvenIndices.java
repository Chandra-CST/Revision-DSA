class CountPositiveElementsAtEvenIndices{
    public static void main(String [] args){

        int[] arr = {-4, 7, 12, -3, 8, 0, 15, -2};

        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0 && arr[i] > 0){
                count++;
            }
        }
        System.out.println(count);
    }
}