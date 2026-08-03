class CountLessThanLast{
    public static void main(String [] args){

        int[] arr = {15, 8, 25, 10, 30, 18};

        int last = arr[5];
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if( arr[i] < last){
                count++;
            }
        }
        System.out.println(count);
    }
}