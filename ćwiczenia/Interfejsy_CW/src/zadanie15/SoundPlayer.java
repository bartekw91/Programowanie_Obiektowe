package zadanie15;

public interface SoundPlayer {
    void playSound();
    default void stopSound()
    {
        System.out.println("Sound stopped");
    }
    static String getDeviceType()
    {
        return "Sound Device";
    }
}
