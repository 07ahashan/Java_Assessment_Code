import java.util.*;

public class MergeArray {
    public static void MergeSortedArray(int[] Array1,int []Array2)
    {
        int[] newArray=new int[Array1.length+Array2.length];

        int i=0;
        for (int j=0;j<Array1.length;j++)
        {
            newArray[i]=Array1[j];
            i++;
        }
        for (int k=0;k<Array2.length;k++)
        {
            newArray[i]=Array2[k];
            i++;
        }
        Arrays.sort(newArray);
        for(int x=0;x<newArray.length;x++)
        {
            System.out.print(newArray[x]+" ");
        }
    }
    public static void main(String[] args) {
        int[] Array1={1,2,32,4,5};
        int[] Array2={11,22,33,44,55};
        MergeSortedArray(Array1,Array2);
    }
}
