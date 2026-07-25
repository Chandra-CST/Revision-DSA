// Pattern: Traversal
import java.util.Scanner;
class main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your values: ");
        int n = sc.nextInt();

        int count = 0;
        while(n > 0){
            n = n / 10;
            count++;
        }
        System.out.print("Digit count: " + count);
    }
}
// Palindrome:
import java.util.Scanner;
class main{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;

        while(num > 0){
            int digit = num % 10;                     (% helps in extracting the digits, simply put i gives us a remainder which is the last di)
            reverse = reverse * 10 + digit;
            num = num/10;
        }
        if(reverse == original)
            System.out.print("Palindrome");
            else{
            System.out.print("Not Palindrome");
            }
        }
//   Armstrong Number:
import java.util.Scanner;
class main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int n = sc.nextInt();

        int original = n;

        int count = 0;
        int temp = n;

        // First Traversal:
        while(temp > 0){
            count++;
            temp = temp / 10;
        }
        // Edge case for 0:
        if(n == 0){
            count = 1;
        }
        // Second Traversal;
        int sum = 0;
        int temp = n;

        while(temp > 0){
            int digit = temp % 10;
            sum += (int) Math.pow(digit, count);
            temp = temp % 10;
        }
        // Edge case for 0 :
        if(temp == 0){
            count = 1;
        }
        // Comparing values tpo get an output:
        if(sum == original){
            System.out.print("Armstrong Number");
        }
        else{
            System.out.print("Not an Armstrong Number");
        }
        }
    }
