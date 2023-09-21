// class Solution {
//     public boolean isPalindrome(String s) {
//         int n=s.length();
//         for(int i=0;i<s.length()/2;i++){
//             if(!Character.isLetterOrDigit(s.charAt(i))){
//                 i++;
//             }
//             if(s.charAt(0) != s.charAt(n-i-1)){
//                 return false;
//             }
//         }
//         return true;
//     }
// }

class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int start = 0;
        int last = s.length() - 1;
         while(start <= last) {
           char currFirst = s.charAt(start);
        	char currLast = s.charAt(last);
        	if (!Character.isLetterOrDigit(currFirst )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		last--;
        	} else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
    }
}