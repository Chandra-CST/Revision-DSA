class CountElementsAtOddIndices{
    public static void main(String [] args){

        int[] arr = {12, 5, 18, 7, 20, 9, 14, 11};

        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(i % 2 != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}