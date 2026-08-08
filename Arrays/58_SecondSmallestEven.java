class SecondSmallestEven {
    public static void main(String[] args) {

        int[] arr = {20, 8, 14, 2, 18, 6};

        boolean foundEven = false;

        int smallest = 0;
        int secondSmallest = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {

                if (!foundEven) {
                    smallest = arr[i];
                    foundEven = true;
                }

                else if (arr[i] < smallest) {
                    secondSmallest = smallest;
                    smallest = arr[i];
                }

                else if (arr[i] > smallest &&
                         (secondSmallest == 0 || arr[i] < secondSmallest)) {
                    secondSmallest = arr[i];
                }
            }
        }

        if (foundEven) {
            System.out.println(secondSmallest);
        } else {
            System.out.println("No even elements found");
        }
    }
}