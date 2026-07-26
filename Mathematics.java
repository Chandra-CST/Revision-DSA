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

// Pattern : Palindrome:

import java.util.Scanner;
class main{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;

        while(num > 0){
            int digit = num % 10;                     (% helps in extracting the digits, simply put i gives us a remainder which is the last digit)
            reverse = reverse * 10 + digit;
            num = num/10;
        }
        if(reverse == original)
            System.out.print("Palindrome");
            else{
            System.out.print("Not Palindrome");
            }
        }
 
  // - Armstrong Number:

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

//  -  Divisor Problem:

  class main{
    public static void main(String [] args){
        int n = 654;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }
}

//  - Prime Numbers: 

import java.util.Scanner;
class main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        boolean isPrime = true;
        int n = sc.nextInt();

        if (n <= 1){
            isPrime = false;
        }

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.print("Prime!");
        }
        else{
            System.out.print("Not Prime!");
        }
    }
}

// - Prime number and counting the primes:

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int n = sc.nextInt();

        int count = 0;

        for(int i = 1; i <= n; i++) {

            boolean isPrime = true;

            if(i <= 1) {
                isPrime = false;
            }
            else {
                for(int j = 2; j <= Math.sqrt(i); j++) {

                    if(i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if(isPrime) {
                count++;
            }
        }

        System.out.println("Number of primes: " + count);
    }
}

// Sieve of Eratosthenes:

class soe{
    public static void main(String [] args){

        int n = 20;

        boolean [] arr = new boolean[n + 1];

        for(int i = 0; i <= n; i++ ){
            arr[i] = true;
        }
        arr[0] = false;
        arr[1] = false;

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(arr[i] == true){
                for(int j = i*i ; j <= n; j += i){
                    arr[j] = false;
                }
            }
        }
        for(int i = 0; i <= n; i++){
            if(arr[i] == true){
            System.out.print(i + " ");
            }
        }
    }
}


// GCD -    Eucledian Algorithm:
// LCM -    USing GCD :- The relationship:

//    LCM × GCD = a × b
//          LCM = a x b / (GCD)

 
class soe{ 
    static int gcd(int a , int b){
    while(b != 0){ 

        int remainder = a % b;

        a = b;

        b = remainder;
    }
    return a;
}
     static int lcm(int a, int b){
       int res = (a * b) / gcd(a, b);

       return res;
    }
    public static void main(String [] args){
        int result = gcd(48 , 18);
        int lcmresult = lcm(8 , 12);

        System.out.println(result);
        System.out.println(lcmresult);
    }
}

// Factorials :

class soe{
    static long factorial(int n){
        long factorial = 1;

        for(int i = 1; i <= n; i++){
            if(i < 0){
            System.out.println("Factorial is invalid!");
            }
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String [] args){
        long result = factorial(4);
        System.out.println(result);
    }
}
