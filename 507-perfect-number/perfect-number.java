// class Solution {
//     public boolean checkPerfectNumber(int num) {
//         int sum=0;
//         for(int i=1;i<num;i++){
//            if(num%i==0){
//                sum+=i;
//            }
//         }
//         if(sum==num){
//             return true;
//         }
//         return false;
//     }
// }

class Solution {
    public boolean checkPerfectNumber(int num) {
        int num1 = 0;
        if(num % 2 != 0){
            return false;
        }else{
        
        for(int i  = 1 ; i<=num/2 ; i++){
            if(num % i == 0){
                num1 += i; 
            }
        }
        }

        return num1==num;
    }
}