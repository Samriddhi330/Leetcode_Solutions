class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] ans = new String[words.length];
        for(int i = 0;i<words.length;i++){
            String str = words[i];
            int n = str.charAt(str.length()-1)-'0';
            ans[n-1]=str.substring(0,str.length()-1);
        }
        StringBuilder build = new StringBuilder();
        for(int i = 0;i<ans.length;i++){
            build.append(ans[i]+" ");
        }
        String a = build.toString();
        String b = a.strip();
        return b;
    }
}
