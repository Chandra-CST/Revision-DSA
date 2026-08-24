class countvowels{
    public static void main(String [] args){

        String s = "programming";

        int count = 0;

        for(int i = 0; i < s.length(); i++){

            switch(s.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;

            }
        }
        System.out.println(count);
    }
}