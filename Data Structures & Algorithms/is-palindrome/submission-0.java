class Solution {
    public boolean isPalindrome(String s) {
         String copy = "";
        // clean string
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(Character.isLetterOrDigit(c)){
                copy += Character.toLowerCase(c);
            }
        }
        char[] ch = copy.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        // reverse
        while(left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }
        String reverse = new String(ch);
        return reverse.equals(copy);
    }
}
