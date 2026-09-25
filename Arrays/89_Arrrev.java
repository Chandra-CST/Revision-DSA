import java.util.Arrays;

class Arrrrev {

    // 1. Find Largest Element
    static int largest(int[] arr) {

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    // 2. Find Second Largest Element
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

    // 3. Linear Search
    static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    // 4. Binary Search
    static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    // 5. Bubble Sort
    static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
             int temp = arr[i];
              arr[i] = arr[minIndex];
              arr[minIndex] = temp;
            
        }
    }
    public static void main(String[] args) {

        // Largest
        int[] arr1 = {7, 2, 9, 4, 1};
        System.out.println("Largest: " + largest(arr1));

        // Second Largest
        System.out.println("Second Largest: " + secondLargest(arr1));

        // Linear Search
        int[] arr2 = {10, 25, 7, 42, 19};
        System.out.println("Linear Search: " + linearSearch(arr2, 42));

        // Binary Search
        int[] arr3 = {3, 8, 12, 17, 25, 31, 44};
        System.out.println("Binary Search: " + binarySearch(arr3, 25));

        // Bubble Sort
        int[] arr4 = {5, 3, 8, 1, 2};

        bubbleSort(arr4);

        System.out.println("Bubble Sort: " + Arrays.toString(arr4));
 
        // Selection Sort
        int[] arr5 = {5, 3, 8, 1, 2};

        selectionSort(arr5);
        
        System.out.println("Selection Sort: " + Arrays.toString(arr5));
    }
}