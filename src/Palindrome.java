public class Palindrome {
    public static boolean ispaliindrome(String str)
    {
        int left=0;
        int right=str.length()-1;
        int count=0;
        while(left<=right)
        {
            if(str.charAt(left)!=(str.charAt(right)))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="naman";
        System.out.println(ispaliindrome(str));
    }
}
