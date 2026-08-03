class SmallestOdd{
    public static void main(String [] args){

        int[] arr = {10, 17, 5, 12, 9, 4, 21};

        int SmallestOdd = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0 && arr[i] < SmallestOdd){
                SmallestOdd = arr[i];
            }
        }
        System.out.println(SmallestOdd);
    }
}