public class MedianOfSortedArray {
    public static float Median(float[] arr)
    {
        int n=arr.length;
        float result=0;
        if(n%2!=0)
        {
            result= arr[n/2];
        }else {
            result=(arr[n/2-1]+arr[n/2])/2;
        }
        return result;
    }
    public static void main(String[] args) {
        float[] arr={1,2,5,8,11,12};
        System.out.println(Median(arr));
    }
}
