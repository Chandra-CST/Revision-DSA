class RecursionSum {

    static int recursionSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + recursionSum(n - 1);
    }

    static int power(int x, int n) {
        if(n == 0){
            return 1;
        }
        return x * power(x, n-1);
    }

    static int[] arr = {1, 2, 3, 4, 5};
    static void printArray(int[] arr, int index){
        if(index == arr.length){
            return;
        }
        System.out.println(arr[index]);
        printArray(arr, index + 1);
    }
    public static void main(String[] args) {
        System.out.println(recursionSum(5));
        System.out.println(power(2,5));
        printArray(arr, 0);
    }
}