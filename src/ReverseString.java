public class ReverseString {
    public static String Reverse(String str)
    {
        int left=0;
        int right=str.length()-1;
        char [] ch=str.toCharArray();
        while(left<=right)
        {
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }
        String res=new String(ch);
        return res;
    }
    public static void main(String[] args) {
        String str="manirul";
        System.out.println(Reverse(str));
    }
}
