package interfaces;

public class Computer implements MusicPlayer, VideoPlayer{
    @Override
    public void playMusic() {
        System.out.println("O Computador esta tocando a musica!");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O Computador esta pausando a musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("O Computador esta parando a musica");
    }

    @Override
    public void playVideo() {
        System.out.println("O Computador esta começando o video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O Computador esta pausando o video");
    }

    @Override
    public void stopVideo() {
        System.out.println("O Computador esta parando o video");
    }
}
