class SearchPattern {

    public static int searchPattern(String text, String pattern){

        for(int i = 0; i <= text.length() - pattern.length(); i++){
            if(text.substring(i, i + pattern.length()).equals(pattern)){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args){

        String text = "geeksforgeeks";
        String pattern = "forgeeks";

        System.out.println(searchPattern(text, pattern));

    }
}