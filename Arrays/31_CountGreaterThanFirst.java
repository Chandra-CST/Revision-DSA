class CountGreaterThanFirst{
    public static void main(String [] args){

        int[] arr = {20, 35, 10, 50, 18, 25};

        int first = arr[0];
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > first){
                count++;
            }
        }
        System.out.println(count);
    }
}