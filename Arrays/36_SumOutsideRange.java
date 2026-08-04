class SumOutsideRange{
    public static void main(String [] args){

        int[] arr = {5, 12, 28, 35, 18, 9, 30};

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 10 || arr[i] > 30){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}