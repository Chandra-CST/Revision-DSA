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

    public static void main(String[] args){
        String str = "MadaM";
        boolean result = isPalindrome(str, 0, str.length() - 1);
        System.out.println(result);

        System.out.println(fibo(4));

        str = "abc";
        sequence(str, 0, "");
    }
}