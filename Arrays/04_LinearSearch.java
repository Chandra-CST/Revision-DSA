class LinearSearch{
    public static void main(String [] args){

        boolean found = false;

        int [] arr = {1,2,4,6,8,10};
        int target = 8;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                found = true;
                System.out.print(i);
                break;
            }
        }
        if(found != true){
            System.out.println("Element not found!");
        }
    }
}