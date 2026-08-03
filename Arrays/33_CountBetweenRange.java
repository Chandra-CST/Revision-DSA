class CountBetweenRange{
    public static void main(String [] args){
        // Count how many elements lie between 10 and 30 (inclusive).

        int[] arr = {5, 12, 28, 35, 18, 9, 30};
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 10 && arr[i] <= 30){
                count++;
            }
        }
        System.out.println(count);
    }
}