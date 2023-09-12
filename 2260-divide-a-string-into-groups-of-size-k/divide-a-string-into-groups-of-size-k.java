class Solution {
    public String[] divideString(String s, int k, char fill) {
     StringBuilder sb = new StringBuilder(s); 
     while((sb.length() % k) != 0 )
         sb.append(fill);
     
     String ans[] = new String[sb.length()/k];
     int idx=0,i=0;
       while(i<sb.length()){
           ans[idx++] = sb.substring(i, i+k).toString();
           i+=k;
       }
       return ans;
    }
}