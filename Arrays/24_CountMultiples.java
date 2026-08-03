class CountMultiples{
    public static void main(String [] args){

        int[] arr = {3, 5, 6, 9, 12, 14, 15};

        int count = 0;

        for(int i = 0; i < arr.length ; i++){
            if(arr[i] % 3 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}