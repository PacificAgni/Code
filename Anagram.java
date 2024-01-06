class Solution {
    public boolean isAnagram(String s, String t) {
       int s1=s.length();
       int s2=t.length();
       if(s1!=s2)
       return false;
       int charcounts[]=new int[26];
       for(int i=0;i<s1;i++)
       {
           charcounts[s.charAt(i)-'a']++;
           charcounts[t.charAt(i)-'a']--;
       }
       for(int count:charcounts)
       if(count!=0)
        return false;
        return true;
       

    }
}
