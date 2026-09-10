class Reverse {

    static void printReverse(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        printReverse(arr, index + 1);
        System.out.println(arr[index]);
    }

    static int sumArray(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + sumArray(arr, index + 1);
    }
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        printReverse(arr, 0);
        System.out.println("The sum of the array elements is: " + sumArray(arr, 0));
    }
}