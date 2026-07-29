class array{
    public static void main(String [] args){
        int[] arr = {4, 7, 2, 9, 8};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}