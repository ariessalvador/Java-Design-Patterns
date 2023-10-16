package CommandPattern;

public class MusicPlayerPowerOff implements Command{
    private MusicPlayer musicPlayer;

    public MusicPlayerPowerOff(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        System.out.println(musicPlayer.switchOff());

    }
}
