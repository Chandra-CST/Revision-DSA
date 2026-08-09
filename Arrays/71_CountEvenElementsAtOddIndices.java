    class CountEvenElementsAtOddIndices{
        public static void main(String [] args){

            int[] arr = {12, 8, 18, 6, 20, 9, 14, 10, 6};

            int count = 0;

            for(int i = 0; i < arr.length; i++){
                if(i % 2 != 0 && arr[i] % 2 == 0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }