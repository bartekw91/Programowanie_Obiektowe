import java.util.Scanner;

public class nr5 {
    public static void run()
    {
     Scanner myObj = new Scanner(System.in);

     System.out.print("Wpisz liczbę a wykonam poszczególne działania: ");
     int cyfra = myObj.nextInt();
     System.out.printf("%d + 140 = %d\n", cyfra, cyfra+=140);
     System.out.printf("%d - 31 = %d\n", cyfra, cyfra-=31);
     System.out.printf("%d * 7 = %d\n", cyfra, cyfra*=7);
     System.out.printf("%d / 13 = %d\n", cyfra, cyfra/=13);
     System.out.printf("%d %% 7 = %d\n", cyfra, cyfra%=7);
     System.out.printf("%d ^ 45 = %d\n", cyfra, (int)Math.pow(cyfra, 45));
     System.out.printf("%d & 67 = %d\n", cyfra, cyfra&=67);
     System.out.printf("%d | 59 = %d\n", cyfra, cyfra|=59);
     System.out.printf("%d XOR 23 = %d\n", cyfra, cyfra^=23);
     System.out.printf("%d << 5 = %d\n", cyfra, cyfra<<=5);
     System.out.printf("%d >> 6 = %d\n", cyfra, cyfra>>=6);
     }
}
