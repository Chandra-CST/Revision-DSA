class FindDuplicate{
    public static void main(String [] args){

        int[] arr = {1, 3, 4, 2, 2};

        boolean found = false;

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){

                if( arr[i] == arr[j] ){
                    found = true;
                    break;
                }
            }
            if(found){
                    System.out.println(arr[i]);
                    break;
        }
    }
}
}

