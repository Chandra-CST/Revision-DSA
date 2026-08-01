class RightRotatebyOne {
    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 6, 7, 9};

        // Store the last element
        int temp = arr[arr.length - 1];

        // Shift every element one position to the right
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Place the last element at the beginning
        arr[0] = temp;

        // Print the rotated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}