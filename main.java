import java.util.Scanner;
class main{
    public static void main(String [] args){
        // largest Number from an array:
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int [n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0]; 
        
        for(int i = 0; i < n; i++){
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }
import java.util.Scanner;
class main{
    public static void main(String [] args){
        // Smallest Number from an array:
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int [n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0]; 
        
        for(int i = 0; i < n; i++){
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);

    }
}
