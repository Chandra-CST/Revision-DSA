class ReverseWords {

    public static void main(String[] args){

        String s = "I love java";

        String[] words = s.split(" ");

        int left = 0;
        int right = words.length - 1;
        String temp;

        while(left < right){
            temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        for(int i = 0; i < words.length; i++){
            System.out.print(words[i] + " ");
        }

    }

}