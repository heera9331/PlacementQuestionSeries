class Solution {
    
    static String extractString(String str) {
        String s = "";
        char[] ch = str.toCharArray();
        for(char c : ch) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                s += c;
            }
        }
        
        return s.toLowerCase();
    }

    public boolean isPalindrome(String s) {
        String str = extractString(s);
        char[] ch  = str.toCharArray();
        int n = ch.length;
        for(int i=0; i<(n)/2; i++) {
            if(ch[i] != ch[n-i-1]) {
                return false;
            }
        }
        return true;   
    }
}
