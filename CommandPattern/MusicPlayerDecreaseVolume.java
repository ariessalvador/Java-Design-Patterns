package CommandPattern;

public class MusicPlayerDecreaseVolume implements Command{
    private MusicPlayer musicPlayer;

    public MusicPlayerDecreaseVolume(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        System.out.println(musicPlayer.decreaseVolume());

    }
}
