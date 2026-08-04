class CountElementsLessThanX{
    public static void main (String [] args){


        int[] arr = {18, 7, 25, 10, 3, 21, 15};
        int x = 15;

        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < x){
                count++;
            }
        }
        System.out.println(count);
    }
}