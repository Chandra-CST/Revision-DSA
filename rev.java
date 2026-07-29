import java.util.Scanner;

class Rev {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;

        double cgpa = 9.0;

        System.out.print("Hello");
        System.out.println("Chandra");
        System.out.println("Your cgpa is: " + cgpa);

        age = sc.nextInt();
        System.out.println("Your age is: " + age);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a + b;

        System.out.println(a);
        System.out.println(b);
        System.out.println("The sum of a and b is: " + c);

        age = sc.nextInt();

        if (age > 18) {
            System.out.println("Can vote!");
        } else {
            System.out.println("Cannot vote!");
        }

        System.out.print("Enter your number: ");

        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Not even");
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }

        for (int i = 10; i >= 1; i -= 2) {
            System.out.println(i);
        }

        sc.close();
    }
}
