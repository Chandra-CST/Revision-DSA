class LastMultipleOfX{
    public static void main(String [] args){

        int[] arr = {12, 18, 21, 24, 27, 30};
        int x = 6;

        int lastX = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % x == 0){
                lastX = arr[i];
            }
        }
        System.out.println(lastX);
    }
}