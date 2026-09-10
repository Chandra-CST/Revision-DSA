class Recursion{

    static boolean search(int[] arr, int index, int target){

        if(index == arr.length){
            return false;
        }
        if(arr[index] == target){
            return true;
        }
        return search(arr, index + 1, target);

    }
    public static void main(String[] args){
        int[] arr = {5,10,15,20};
        System.out.println(search(arr,0,23));
    }
}