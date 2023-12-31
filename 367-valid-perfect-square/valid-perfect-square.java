// class Solution {
//     public boolean isPerfectSquare(int num) {
//         if(num==1)
//         {
//             return true;
//         }
//         long i=0;
//         long n = num;
//         while(i*i<=n)
//         {
//             if(i*i == n)
//                 return true;
//             i++;
//         }
//         return false;
//     }
// }

class Solution {
    public boolean isPerfectSquare(int num) {
      if(num==1){
          return true;
      }
      int low=0;
      int high= num/2;
      while(low<=high){
         int mid=  low+(high-low)/2;
         if(mid== num/mid && num%mid==0){
             return true;
         }
         else if (mid < num / mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
      }
    }
