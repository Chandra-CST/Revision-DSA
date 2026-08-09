class SmallestPositiveAtEvenIndices{
    public static void main(String [] args){

        int[] arr = {-4, 12, -7, 5, 18, -2, 3, 20};

        int smallest = -1;
        boolean found = false;

        for(int i = 0; i < arr.length; i++){
            
            if( i % 2 == 0 && arr[i] > 0 ){

                if(!found){

                    smallest = arr[i];
                    found = true;

                }
                else if( arr[i] < smallest){

                    smallest = arr[i];

                }
            }
        }
        System.out.println(smallest);
    }
}