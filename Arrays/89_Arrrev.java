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
    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 42, 19};

        int target = 42;

        System.out.println(LinearSearch(arr, target));

        // int[] arr = {10, 20, 15, 8, 25};

        // System.out.println(secondLargest(arr));
        // System.out.println(largest(arr));
    }
}