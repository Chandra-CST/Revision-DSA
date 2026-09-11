class Solution {

    // GFG method
    void powerSet(String str) {
        // What should you call here?
         generate(str, 0, "");
    }

    // Your helper
    void generate(String str, int index, String current) {

        // 1. Base case
        if(index == str.length()){
            System.out.println(current);
            return;
        }


        // 2. TAKE
        generate(str, index + 1, current + str.charAt(index));


        // 3. SKIP
        generate(str, index + 1, current);

    }
    public static void main(String[] args){
        String str = "abc";
        new Solution().powerSet(str);
    }
}