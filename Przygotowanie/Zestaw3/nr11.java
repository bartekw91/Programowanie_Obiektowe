public class nr11 {
    public static int ciagFibonacciego(int n)
    {
        if(n==0) return 0;
        else if (n==1) return 1;
        else return ciagFibonacciego(n-1)+ciagFibonacciego(n-2);
    }
}
