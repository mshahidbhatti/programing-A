package InheritanceTest;

public class VideoPlayer extends MediaPlayer{

    @Override
    public void increaseVolume() {
        System.out.println("Volume increased");
    }

    @Override
    public void play(){
        System.out.println("play method of video player");
    }
}
