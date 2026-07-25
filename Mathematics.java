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
