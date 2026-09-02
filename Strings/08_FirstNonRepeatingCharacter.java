class FirstNonRepeatingCharacter {

    public static char firstNonRepeating(String s) {

        int[] freq = new int[256];

        // Count every character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }

        // Find first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (freq[ch] == 1) {
                return ch;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        String s = "aabbcd";

        System.out.println(firstNonRepeating(s));
    }
}