class FindMissingNumber{
    public static void main(String [] args){

        int[] arr = {3, 0, 1};

        for(int x = 0; x <= arr.length; x++){

    boolean found = false;

    for(int i = 0; i < arr.length; i++){
        if(arr[i] == x){
            found = true;
            break;
        }
    }

    if(!found){
        System.out.println(x);
        break;
    }
    }
    }
}