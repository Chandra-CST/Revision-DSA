//  Check if Target Exists :
class target{
    public static void main(String [] args){

        int[] arr = {12, 45, 8, 91, 34, 67};
        
        int target = 23;

        boolean isFound = false;

        for(int i = 0; i < arr.length; i++){
            if( arr[i] == target){
                isFound = true;
                break;
            }
        }
        if(isFound){
            System.out.println("Target Found");
        }
        else{
            System.out.println("Target does not exist");
        }
    }
}