class IndexOfLastMultipleOfX{
    public static void main(String [] args){

        int[] arr = {8, 12, 15, 16, 20, 21, 24};
        int x = 4;

        int lastX = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % x == 0){
                lastX = i;
            }
        }

        System.out.println(lastX);
    }
}