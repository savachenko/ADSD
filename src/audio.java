import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class audio{


    public static void main(String[] args) {
        Mythread thread1=new Mythread();
        thread1.start();

    }

    public static synchronized void playSound(final String url) {

        System.out.println("void play sound");

        new Thread(new Runnable() {

            public void run() {

                System.out.println("void run");

                try {
                    File soundFile = new File("C:\\Users\\Used ProductsDownloads\\\\\ringtone.wav"); //Звуковой файл

                    //Получаем AudioInputStream
                    //Вот тут могут полететь IOException и UnsupportedAudioFileException
                    AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);

                    //Получаем реализацию интерфейса Clip
                    //Может выкинуть LineUnavailableException
                    Clip clip = AudioSystem.getClip();

                    //Загружаем наш звуковой поток в Clip
                    //Может выкинуть IOException и LineUnavailableException
                    clip.open(ais);

                    clip.setFramePosition(1); //устанавливаем указатель на старт
                    clip.start(); //Поехали!!!

                    //Если не запущено других потоков, то стоит подождать, пока клип не закончится
                    //В GUI-приложениях следующие 3 строчки не понадобятся
                    Thread.sleep(clip.getMicrosecondLength() / 1000);
                    clip.stop(); //Останавливаем
                    clip.close(); //Закрываем
                } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
                    exc.printStackTrace();
                } catch (InterruptedException exc) {
                }

            }



        });


    }
}



class Mythread extends Thread {
    public void run() {

        System.out.println("void run");

        try {
            File soundFile = new File("C:\\Users\\Used Products\\Downloads\\ringtone.wav"); //Звуковой файл

            //Получаем AudioInputStream
            //Вот тут могут полететь IOException и UnsupportedAudioFileException
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);

            //Получаем реализацию интерфейса Clip
            //Может выкинуть LineUnavailableException
            Clip clip = AudioSystem.getClip();

            //Загружаем наш звуковой поток в Clip
            //Может выкинуть IOException и LineUnavailableException
            clip.open(ais);

            clip.setFramePosition(1); //устанавливаем указатель на старт
            clip.start(); //Поехали!!!

            //Если не запущено других потоков, то стоит подождать, пока клип не закончится
            //В GUI-приложениях следующие 3 строчки не понадобятся
            Thread.sleep(clip.getMicrosecondLength() / 1000);
            clip.stop(); //Останавливаем
            clip.close(); //Закрываем
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
            exc.printStackTrace();
        } catch (InterruptedException exc) {
        }


    }

}