public class FirstOccurance {
    public static int firstOccurance(int[] arr,int k)
    {
        int index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==k)
            {
                index=i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,3,9};
        int k=3;
        System.out.println(firstOccurance(arr,k));
    }
}
