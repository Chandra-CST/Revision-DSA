class OneToNWithoutLoop {

    static int countDigits(int n){
        if(n == 0){
            return 0;
        }
        return 1 + countDigits(n / 10);
    }

    static int sumDigits(int n){
        if(n == 0){
            return 0;
        }
        return (n % 10) + sumDigits(n / 10);
    }

    static void OnetoN(int n) {
        if(n == 0){
            return;
        }
        OnetoN(n - 1);
        System.out.println(n);
    }


    public static void main(String[] args){
        // OnetoN(5);
        int n = 12345;
    //    System.out.print(sumDigits(n));
       System.out.print(countDigits(n));
    }

}