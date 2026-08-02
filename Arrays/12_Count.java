class Count{
    public static void main(String [] args){

        int[] arr = {5, -3, 0, 7, -1, 0, 9, -6};

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0 ){
                positive++;
            }
            else if (arr[i] < 0){
                negative++;
            }
            else{
                zero++;
            }
        }
        System.out.println("positive = " + positive);
        System.out.println("negative = " + negative);
        System.out.println("zero = " + zero);
    }
}