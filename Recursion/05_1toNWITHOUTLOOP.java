class OneToNWithoutLoop {

    static void OnetoN(int n) {
        if(n == 0){
            return;
        }
        OnetoN(n - 1);
        System.out.println(n);
    }


    public static void main(String[] args){
        OnetoN(5);
    }

}