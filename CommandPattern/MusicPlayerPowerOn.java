package CommandPattern;

public class MusicPlayerPowerOn implements Command{
    private MusicPlayer musicPlayer;

    public MusicPlayerPowerOn(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        System.out.println(musicPlayer.switchOn());
    }
}
