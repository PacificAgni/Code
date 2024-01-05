class Solution {
    public boolean isSubsequence(String s, String t) {
      
      int p1=0;
      int count=0;
      int pointer2=0;  
      int slength=s.length();
      int tlength=t.length();
      if(slength==0)
      return true;  

      for(char ch: t.toCharArray())
      {
          if(s.charAt(p1)==ch){
              p1++;
              count++;
              if(p1>=slength)
              break;

          }
      }  

      return (count==slength);


    }
}
