package interfaces;

public class MusicBox implements MusicPlayer{
    @Override
    public void playMusic() {
        System.out.println("A Caixa de Som esta tocando a musica!");
    }

    @Override
    public void pauseMusic() {
        System.out.println("A Caixa de Som esta pausando a musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("A Caixa de Som esta parando a musica");
    }
}
