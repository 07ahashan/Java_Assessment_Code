public class SmallestElement {
    public static int Smallest(int[] arr)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }

       return min;
    }
    public static void main(String[] args) {
        int[] arr={8,9,4,2,5,1,7,1};
        System.out.println(Smallest(arr));
    }
}
