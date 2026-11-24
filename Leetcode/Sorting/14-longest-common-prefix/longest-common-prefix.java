class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n =strs.length;
        int m=strs[0].length();

        if(n==0||strs==null) return "";
        for(int i=0;i<m;i++){
            char c=strs[0].charAt(i);
            for(int j=1;j<n;j++){
                if(i==strs[j].length()||c!=strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}