class Anagram{
    public static void main(String [] args){

        String s1 = "silent";
        String s2 = "listen";

        int[] freq = new int[256];

        for(int i = 0; i < s1.length(); i++){
            freq[s1.charAt(i)]++;
        }
        for(int i = 0; i < s2.length(); i++){
            freq[s2.charAt(i)]--;
        }
        for(int i = 0; i < freq.length; i++){
            if(freq[i] != 0){
                System.out.println("Not an anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}