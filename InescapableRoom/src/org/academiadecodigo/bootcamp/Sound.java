package org.academiadecodigo.bootcamp;

import javax.sound.sampled.*;
import java.io.IOError;
import java.io.IOException;
import java.net.URL;

public class Sound {
    public static void PlaySound(String filePath){
        try{
            URL defaultSound = Sound.class.getResource(filePath);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(defaultSound);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
        } catch (UnsupportedAudioFileException e){
            e.getStackTrace();
        } catch(IOException e){
            e.getStackTrace();
        } catch(LineUnavailableException e ){
            e.getStackTrace();
        }

    }
}
