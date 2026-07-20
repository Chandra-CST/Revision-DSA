//  #COUNT PATTERN:
import java.util.Scanner;
class main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of your array: ");
        int n = sc.nextInt();
        int [] arr = new int [n];

        System.out.print("Enter your elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] % 2 != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
import java.util.Scanner;
class main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of your array: ");
        int n = sc.nextInt();
        int [] arr = new int [n];

        System.out.print("Enter your elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        boolean found = false;
        
        System.out.print("Enter the element you want to search:");
        int target = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            if(arr[i] == target){
                found = true;
                break;
            }
        }

        System.out.println(found);
    }
