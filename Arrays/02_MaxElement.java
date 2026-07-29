class MaxElement{
    public static void main(String [] args){

        int [] arr = {4,66,7,91,7,201,36};

        int max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if( arr[i] > max){
                max = arr[i];
                }
        }
        System.out.println(max);

    }
}