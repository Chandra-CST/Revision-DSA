
// Reversing an array | Two pointer pattern:
class main{
    public static void main(String [] args){
        int [] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }


    }
}
// Palidrome:
import java.util.Scanner;
class main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your data to check if it is palindrome or not: ");
        
        String s = sc.next();
        int left = 0;
        int right = s.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.print("Palindrome");
        } else {
            System.out.print("Not Palindrome");
        }
    }
}
