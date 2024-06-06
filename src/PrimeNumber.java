public class PrimeNumber {
    public static boolean PrimeNumber(int num)
    {
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count==2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int num=21;
        System.out.println(PrimeNumber(num));
    }
}
