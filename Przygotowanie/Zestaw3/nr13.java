public class nr13 {
    public static boolean czyPalindrom(String wyraz)
    {
        String wyraz_f = wyraz.trim();
        String wyraz_rev = "";
        for(int i = 0;i < wyraz_f.length();i++)
        {
            wyraz_rev = wyraz_f.charAt(i) + wyraz_rev;
        }
        if (wyraz_rev.equals(wyraz_f)) return true;
        else return false;
    }
}
