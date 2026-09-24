class Arrrrev {

    static int secondLargest(int[] arr) {

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    static int largest(int[] arr) {
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    static int LinearSearch(int [] arr, int target){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
    
    static int binarySearch(int [] arr, int target){

        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if (arr[mid] == target){
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            }
            else if (arr[mid] > target) {
                right = mid - 1;
            }
            else {
                return mid;
            }
        }

        return - 1;
    } 
    public static void main(String[] args) {

        int[] arr = {3, 8, 12, 17, 25, 31, 44};

        System.out.println(binarySearch(arr, 25));


        // int[] arr = {10, 25, 7, 42, 19};

        // int target = 42;

        // System.out.println(LinearSearch(arr, target));

        // int[] arr = {10, 20, 15, 8, 25};

        // System.out.println(secondLargest(arr));
        // System.out.println(largest(arr));
    }
}