class Solution {
    public boolean isPalindrome(String s) {
        String a = s.toLowerCase();
        int i = 0;
        int j = a.length()-1;
        while(i<j){
            if(!Character.isLetterOrDigit(a.charAt(i))){
                i++;
            }else if(!Character.isLetterOrDigit(a.charAt(j))){
                j--;
            }else{
                if(a.charAt(i)!=a.charAt(j)){
                    return false;
                }else{
                    i++;
                    j--;
                }
            }
        }
        return true;
    }
}
