package CommandPattern;

public class MusicPlayerIncreaseVolume implements Command{
    private MusicPlayer musicPlayer;

    public MusicPlayerIncreaseVolume(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        System.out.println(musicPlayer.increaseVolume());

    }
}

