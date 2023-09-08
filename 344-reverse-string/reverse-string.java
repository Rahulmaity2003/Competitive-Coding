class Solution {
    public void reverseString(char[] s) {
       int Start =0;
       int end = s.length-1;
       while(Start < end){
           char temp = s[Start];
           s[Start] = s[end];
           s[end]= temp;
           Start++;
           end--;
       }

        }
    }