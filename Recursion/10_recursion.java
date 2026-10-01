class Recursion{
    static boolean isPalindrome(String str, int left , int right){
        if(left >= right){
            return true;
        }
        if(str.charAt(left) != str.charAt(right)){
            return false;
        }
        return isPalindrome(str, left + 1, right -1);
    }

    // Multiple n functions inside a single recursion function:
    static int fibo(int n){
        if(n <= 1){
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);

    }
    
    // Sequences usinng recursion function:
    static void sequence(String str, int index, String current){
        if(index == str.length()){
            System.out.println(current);
            return;
        }
        sequence(
            str,
            index + 1,
            current + str.charAt(index)
        );

        sequence(
            str,
            index + 1,
            current
        );

    }
    

    // Pointing subsequences whose sum is k:
    static void subsequences(int[] arr, int index, String current, int sum, int k){
        if(index == arr.length){
            if(sum == k){
                System.out.println(current);
            }
            return;
        }
        subsequences(
            arr,
            index + 1,
            current + arr[index] + " ",
            sum + arr[index],
            k
        );

        subsequences(
            arr,
            index + 1,
            current,
            sum,
            k
        );


    }
    public static void main(String[] args){
        String str = "MadaM";
        boolean result = isPalindrome(str, 0, str.length() - 1);
        System.out.println(result);

        System.out.println(fibo(4));

        str = "abc";
        sequence(str, 0, "");
        
        int[] arr = {1,2,1};
        int k = 2;

        subsequences(arr, 0, "", 0, k);
    }
}