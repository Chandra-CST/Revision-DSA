class CopyArray{
    public static void main(String [] args){

        int[] arr = {5, 8, 12, 3, 9};

        int [] copy = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            copy[i] = arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(copy[i] + " ");
        }
    }
}