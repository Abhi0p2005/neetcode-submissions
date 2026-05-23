class Solution {
    public boolean isPalindrome(String s) {
       String trimmedS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] word = trimmedS.toCharArray();
        char[] reversedWord = new char[trimmedS.length()];
        for(int i = trimmedS.length() -1;i>=0;i--){
            reversedWord[trimmedS.length() - 1 - i] = word[i];;
        }
        return (Arrays.equals(word,reversedWord));

        
    }
}
