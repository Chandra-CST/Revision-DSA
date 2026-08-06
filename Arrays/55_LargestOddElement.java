class LargestOddElement{
    public static void main(String [] args){

        int[] arr = {12, 17, 9, 30, 45, 18};

        int largestOdd = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0 && arr[i] > largestOdd ){
                largestOdd = arr[i];
            }
        }
        System.out.println(largestOdd);
    }
}