class FirstRepeatingCharacter {

     static char firstRepeating(String s) {

        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (freq[ch] > 0) {
                return ch;
            }

            freq[ch]++;
        }

        return '\0';
    }

    public static void main(String[] args) {

        String s = "geeksforgeeks";

        System.out.println(firstRepeating(s));
    }
}