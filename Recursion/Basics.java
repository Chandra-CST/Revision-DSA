class Basics{
     
    //  Print from 1 to N:
    static void printNumber(int num){
        if(num == 0){
            return;
        }
        printNumber(num - 1);
        System.out.println(num);
    }
    
    // print from N to 1:
    static void printNum(int n){
        if( n == 0 ){
            return ;
        }
        System.out.println(n);
        printNum(n -1);

    }
    
    // print a name N times:
    static void printName(int x){
        if(x == 0){
            return;
        }
        System.out.println("Chandra");
        printName(x - 1);

    }

    // sum using recursion function:
    static int sum(int num1){
        if(num1 == 0){
            return 0;
        }
        return num1 + sum(num1-1);
    }


    // factorial:
    static int fact(int num2){
        if(num2 == 0){
            return 1;
        }
        return num2 * fact(num2 - 1);
    }

    // Reversing a string using recursion but using a single pointer only:
    static void printArray(int[] arr, int i, int n){
        if(i >= n/2){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;

        printArray(arr, i + 1, n);
    }

    // Reversinng a string using two pointers:
    static void reverseArray(int left, int right, int[] arr){
        if(left == right){
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverseArray( left + 1, right - 1, arr);
    }
    
    public static void main(String[] args){
        printNumber(5);
        printNum(5);
        printName(3);
        System.out.println("The sum is : " + sum(5));
        System.out.println("The factorial is: " + fact(4));

        int[] arr = {1,2,3,4,5};
        printArray(arr, 0, arr.length);
        System.out.println(java.util.Arrays.toString(arr));

        int[] arr2 = {22,11,33,44,55};
        reverseArray(0, arr2.length - 1, arr2);
        System.out.println(java.util.Arrays.toString(arr2));
    }
}
