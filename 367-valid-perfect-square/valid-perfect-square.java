class Solution {
    public boolean isPerfectSquare(int num) {
        // long n = num;
        if(num==1){
            return true;
        }
         long i=0;
        long n = num;
        while(i<num){
            if(i*i == num){
                return true;
            }
            i++;
        }
        return false;
    }
}
// class solution{
//     public boolean isPerfectSquare(int num){
//     if(num==1){
//         return true;
//     }
//     int low = 0;
//     int high = 
//     }
// }