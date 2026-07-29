class MinElement{
    public static void main(String [] args){

        int [] arr = {1,5,61,32,2};

        int min = arr[0];

        for(int i = 1; i < arr.length; i++){
            if( arr[i] <= min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}