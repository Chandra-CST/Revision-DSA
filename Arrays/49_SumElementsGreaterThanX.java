class SumElementsGreaterThanX{
    public static void main(String [] args){

        int[] arr = {18, 7, 25, 10, 3, 21, 15};
        int x = 15;

        int sum = 0; 
        
        for (int i = 0; i < arr.length; i++){
            if( arr[i] > x){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}