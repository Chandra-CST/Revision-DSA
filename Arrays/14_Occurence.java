class Occurence{
    public static void main(String [] args){

        int[] arr = {4, 7, 2, 7, 9, 7, 1, 7};

        int target = 7;

        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        System.out.println("The occurence of " + target + " is " + count);
    }
}