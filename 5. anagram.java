class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch = s.toCharArray();
        char[] ch1 = t.toCharArray();
        
        Arrays.sort(ch);
        Arrays.sort(ch1);
        
        String s1 = new String(ch);
        String s2 = new String(ch1);
        
        if(s1.equals(s2)) {
            return true;
        } else {
            return false;
        }
        
    }
}
