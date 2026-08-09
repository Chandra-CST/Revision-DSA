class SumEvenElementsAtOddIndices{
    public static void main(String [] args){

        int[] arr = {15, 8, 21, 6, 14, 9, 20, 12};
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            if(i % 2 != 0 && arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}