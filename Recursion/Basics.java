class Basics{
     
    //  Print from 1 to N:
    static void printNumber(int num){
        if(num == 0){
            return;
        }
        printNumber(num - 1);
        System.out.println(num);
    }
    
    // print from N to 1:
    static void printNum(int n){
        if( n == 0 ){
            return ;
        }
        System.out.println(n);
        printNum(n -1);

    }
    
    // print a name N times:
    static void printName(int x){
        if(x == 0){
            return;
        }
        System.out.println("Chandra");
        printName(x - 1);

    }

    // sum using recursion function:
    static int sum(int num1){
        if(num1 == 0){
            return 0;
        }
        return num1 + sum(num1-1);
    }


    // factorial:

    static int fact(int num2){
        if(num2 == 0){
            return 1;
        }
        return num2 * fact(num2 - 1);
    }

    public static void main(String[] args){
        printNumber(5);
        printNum(5);
        printName(3);
        System.out.println("The sum of the recursive function is : " + sum(5));
        System.out.println("The factorial is: " + fact(4));
    }
}
