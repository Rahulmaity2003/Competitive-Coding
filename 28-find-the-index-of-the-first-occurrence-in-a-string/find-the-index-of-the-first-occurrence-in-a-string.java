// class Solution {
//     // public  boolean compare(String haystack, String needle,int index){
//     //     int n1=haystack.length();
//     //     int n2 = needle.length();

//     //     for(int i=0;i<n2;i++){
//     //         if(index>=n1) return false;
//     //         if(haystack.charAt(index) != needle.charAt(i)){
//     //             return false;
//     //         }
//     //     }
//     //     return true;
//     // }
//     public int strStr(String haystack, String needle) {
//         for(int i=0;i<haystack.length()-needle.length()+1;i++){
//             if(haystack.charAt(i) == needle.charAt(0)){
//                if(haystack.substring(i,needle.length()+i).equals(needle)){
//                    return 0;
//                }
//             }
//         }
//         return -1;
//     //   int n1=haystack.length(); 
//     //    for(int i=0;i<n1;i++){
//     //        if(haystack.charAt(i)==needle.charAt(0)){
//     //            if(compare(haystack,needle,i)==true){
//     //                return i;
//     //            }
//     //        }
//     //    }
//     //    return -1;
//     }
// }
class Solution {
    public int strStr(String haystack, String needle) {

        // int nSize = needle.length();
        // int nFoundAt = -1;

        // for(int i = 0; i <= (haystack.length() - nSize); i++) {
        //      if(haystack.substring(i, i + nSize).equals(needle)) {
        //          nFoundAt = i;
        //          break;
        //      }
        // }

        // return nFoundAt;
        return haystack.indexOf(needle);
    }
}