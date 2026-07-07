class Solution {
    public String interpret(String command) {
        StringBuilder build = new StringBuilder();
        for(int i = 0; i<command.length();i++){
            if(command.charAt(i)=='G'){
                build.append('G');
            }else if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                build.append('o');
                i=i+1;
            }else{
                build.append("al");
                i=i+3;
            }
        }
        String ans = build.toString();
        return ans;
    }
}
