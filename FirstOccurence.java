class Solution {
    public int strStr(String haystack, String needle) {
       int i=0,j=0;
       while(i<=haystack.length()-needle.length())
       {
           j=0;
           while(j<needle.length() &&haystack.charAt(i+j)==  needle.charAt(j))
           j++;
           if(j==needle.length())
           return i;
           i++;
       } 
       return -1;
    }
}
