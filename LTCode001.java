
class Solution {
    public boolean isPalindrome(int x) {
        //palindrome of integers
// public boolean isPalindrome(int x) {
//         String st = Integer.toString(x);
//         for(int i=0;i<st.length();i++ ){
//             char start = st.charAt(i);
//             char end = st.charAt(st.length() - 1 - i);
//             if (start != end) {
//                 return false;
//             }
//         }

//         return true;
    
//     }
        
            if(x==0){
                return true;
            }
            int original = x;
            int reversed = 0;
            while(x>0){
                int digit=x%10;
                reversed = reversed * 10 + digit;
                x=x/10;
            }
            return (reversed==original);
}
}

public class LTCode001{
    public static void main(String[] args) {
        Solution s=new Solution();
        int x =121;
        System.out.println(x+" palindrome is "+s.isPalindrome(x));
    }
}