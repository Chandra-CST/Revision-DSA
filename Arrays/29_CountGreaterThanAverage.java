class CountGreaterThanAverage{
    public static void main(String [] args){

        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        int average = sum / arr.length;
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > average){
                System.out.println(arr[i]);
                count++;
            }
        }

        System.out.println("Count: " + count);
    }
}