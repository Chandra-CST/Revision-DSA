class LastEven{
    public static void main(String [] args){

        int[] arr = {11, 8, 5, 12, 9, 4, 7};

        int LastEven = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                LastEven = arr[i];
            }
        }
        System.out.println(LastEven);
    }
}