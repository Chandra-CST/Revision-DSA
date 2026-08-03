class LargestEven {
    public static void main(String[] args) {

        int[] arr = {11, 8, 5, 12, 9, 4, 18};

        int largestEven = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] > largestEven) {
                largestEven = arr[i];
            }
        }

        System.out.println(largestEven);
    }
}