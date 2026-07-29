class Main {

    public static void main(String[] args) {

        int n = 7;

        int prev = 0;
        int curr = 1;

        System.out.print(prev + " ");
        System.out.print(curr + " ");

        for(int i = 3; i <= n; i++) {

            int next = prev + curr;

            System.out.print(next + " ");

            prev = curr;
            curr = next;
        }
    }
}

// EXAMPLE-1:

class Main {
    public static void main(String[] args) {

        int n = 5;

        int prev = 0;
        int curr = 1;

        System.out.print(prev + " ");
        System.out.print(curr + " ");

        for(int i = 3; i <= n; i++) {
            int next = prev + curr;

            System.out.print(next + " ");

            prev = curr;
            curr = next;
        }
    }
}

//  EXAMPLE 2:

class Main {
    public static void main(String[] args) {

        int n = 10;

        int prev = 0;
        int curr = 1;

        System.out.print(prev + " ");
        System.out.print(curr + " ");

        for(int i = 3; i <= n; i++) {
            int next = prev + curr;

            System.out.print(next + " ");

            prev = curr;
            curr = next;
        }
    }
}

// ? 
