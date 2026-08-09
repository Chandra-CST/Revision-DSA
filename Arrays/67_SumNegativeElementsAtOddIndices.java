class SumNegativeElementsAtOddIndices{
    public static void main(String [] args){

        int[] arr = {10, -7, 15, -20, 8, -13, 6, -11};

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            if(i % 2 != 0 && arr[i] < 0){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}