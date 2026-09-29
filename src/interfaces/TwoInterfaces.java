interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playSong();
}

class SmartPhone implements Camera, MusicPlayer {
    public void takePhoto() {
        System.out.println("Photo clicked");
    }

    public void playSong() {
        System.out.println("Song playing");
    }
}

public class TwoInterfaces {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.takePhoto();
        phone.playSong();
    }
}
