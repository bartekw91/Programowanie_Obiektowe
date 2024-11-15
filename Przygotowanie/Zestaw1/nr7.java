public class nr7 {
    public static void run()
    {
    char[] tablica_z = {'A', '!', '@', '>', '~', '\n', '\b'};

    for(int i=0;i < tablica_z.length;i++)
        {
            int ascii_k = tablica_z[i];
            if(i < 5)
            {
                System.out.printf("%c ma kod ASCII:%d\n", tablica_z[i], ascii_k);
            }
            else if (i == 5)
            {
                System.out.printf("\\n ma kod ASCII:%d\n", ascii_k);
            }
            else
            {
                System.out.printf("\\b ma kod ASCII:%d\n", ascii_k);
            }
        }
    }
}
