class IndexOfSmallestOddElement {
    public static void main(String[] args) {

        int[] arr = {14, 17, 9, 22, 5, 18, 11};

        int smallestOdd = 0;
        int smallestIndex = -1;

        boolean foundOdd = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {

                if (!foundOdd) {
                    smallestOdd = arr[i];
                    smallestIndex = i;
                    foundOdd = true;
                } 
                else if (arr[i] < smallestOdd) {
                    smallestOdd = arr[i];
                    smallestIndex = i;
                }
            }
        }

        if (foundOdd) {
            System.out.println(smallestIndex);
        } else {
            System.out.println("No odd element found");
        }
    }
}