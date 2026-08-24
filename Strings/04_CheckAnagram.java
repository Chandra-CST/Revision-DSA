class anagram{
    public static void main(String [] args){

        String s1 = "silent";
        String s2 = "listen";

        boolean isAnagram = true;

        if(s1.length() != s2.length()){
            isAnagram = false;
        }
        else{

            for(int i = 0; i < s1.length(); i++){

                int count1 = 0;
                int count2 = 0;

                for(int j = 0; j < s1.length(); j++){
                    if(s1.charAt(i) == s1.charAt(j)){
                        count1++;
                    }
                }

                for (int j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i) == s2.charAt(j)) {
                        count2++;
                    }
                }
                if(count1 != count2){
                    isAnagram = false;
                    break;
                }
            }
        }
        System.out.println(isAnagram);
    }
}