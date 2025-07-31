package interfaces;

public class Smartphone implements MusicPlayer, VideoPlayer{
    @Override
    public void playMusic() {
        System.out.println("O Smartphone esta tocando a musica!");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O Smartphone esta pausando a musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("O Smartphone esta parando a musica");
    }

    @Override
    public void playVideo() {
        System.out.println("O Smartphone esta começando o video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O Smartphone esta pausando o video");
    }

    @Override
    public void stopVideo() {
        System.out.println("O Smartphone esta parando o video");
    }
}
