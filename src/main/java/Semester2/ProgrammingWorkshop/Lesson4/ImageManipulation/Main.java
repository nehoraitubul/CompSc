package Semester2.ProgrammingWorkshop.Lesson4.ImageManipulation;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\EduLabsCourse\\HomeWorks\\Exersice_H\\H1\\imgs\\1366_v9_bc.jpg");
            if (file.exists()){
                System.out.println("file exist");
                BufferedImage myImage = ImageIO.read(file);
                int width = myImage.getWidth();
                int height = myImage.getHeight();
                for (int i = 0; i < width; i++) {
                    for (int j = 0; j < height; j++) {
                        int rgb = myImage.getRGB(i, j);
                        Color color = new Color(rgb);
                        int red = (int) (color.getRed() * 0.6f);
                        int blue = (int) (color.getBlue() * 0.6f);
                        int green = (int) (color.getGreen() * 0.6f);
                        if (red > 255){
                            red = 255;
                        }
                        if (green > 255){
                            green = 255;
                        }
                        if (blue > 255){
                            blue = 255;
                        }
                        Color newColor = new Color(red, green, blue);
                        myImage.setRGB(i, j, newColor.getRGB());
                    }
                }
                File output = new File("C:\\EduLabsCourse\\HomeWorks\\Exersice_H\\H1\\imgs\\1366_v9_bcc.jpg");
                ImageIO.write(myImage, "jpg", output);


            }

        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
