// Find the Last Odd Element : 

class LastOdd{
    public static void main(String [] args){

        int[] arr = {10, 18, 5, 12, 9, 4, 7};

        int LastOdd = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                LastOdd = arr[i];
            }
        }
        System.out.println(LastOdd);
    }
}