class Recursion{

    static int sumDigits(int n){
        if(n == 0){
            return 0;
        }
        return (n % 10) + sumDigits(n / 10);

    }

    static boolean isPalindrome(String str, int left, int right){

        if(left >= right){
            return true;
        }
        if( str.charAt(left) != str.charAt(right) ){
            return false;
        }
        return isPalindrome(str, left +1, right - 1);

    }

    static int[] arr = {8, 12, 20, 25};
    static boolean searching(int[] arr, int index, int target){

        if( index == arr.length ){
            return false;
        }
        if(arr[index] == target){
            return true;
        }
        return searching(arr, index + 1, target);

    }

    static boolean search(int[] arr, int index, int target){

        if(index == arr.length){
            return false;
        }
        if(arr[index] == target){
            return true;
        }
        return search(arr, index + 1, target);

    }
    
    
    static int count(int n){
        if(n == 0){
            return 0;
        }
        return 1 + count(n / 10);
    }

    
    public static void main(String[] args){
        // int[] arr = {5,10,15,20};
        // System.out.println(search(arr,0,23));
        // // System.out.println(searching(arr,0,20));
        // System.out.println(isPalindrome("listen", 0, 4));
        int n = 456;
        System.out.println(sumDigits(n));
        System.out.println(count(n));
    }
}