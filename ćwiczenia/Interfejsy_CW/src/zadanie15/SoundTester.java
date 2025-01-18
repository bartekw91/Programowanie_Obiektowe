package zadanie15;

public class SoundTester {
    public static void main(String[] args)
    {
        MusicPlayer odtwarzacz = new MusicPlayer();
        Radio radioman = new Radio();
        odtwarzacz.playSound();
        odtwarzacz.stopSound();
        radioman.playSound();
        radioman.stopSound();
        System.out.println(SoundPlayer.getDeviceType());
    }
}
