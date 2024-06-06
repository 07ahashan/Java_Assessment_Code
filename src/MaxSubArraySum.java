public class MaxSubArraySum {
    public static int MaxSum(int [] arr)
    {
        int max=0;
        int sum=0;
        int i=0;
        while(i<arr.length)
        {
            sum=sum+arr[i];
            max=Math.max(sum,max);
            if(sum<0)
            {
                sum=0;
            }
            i++;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={1,0,-3,2,5,8,7};
        System.out.println(MaxSum(arr));
    }
}
