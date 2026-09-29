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

    public static void main(String[] args){
        String str = "MadaM";
        boolean result = isPalindrome(str, 0, str.length() - 1);
        System.out.println(result);
    }
}