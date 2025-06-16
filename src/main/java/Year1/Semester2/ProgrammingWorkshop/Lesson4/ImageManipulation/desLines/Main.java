package Year1.Semester2.ProgrammingWorkshop.Lesson4.ImageManipulation.desLines;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        double num = 3f;
        try {
            File file = new File("src/main/java/Year1.Semester2/ProgrammingWorkshop/Lesson4/ImageManipulation/desLines/cake.jpg");
            if (file.exists()){
                Color color;
                Color newColor = new Color(255, 255, 255);
                System.out.println("Exist");
                BufferedImage image = ImageIO.read(file);
                for (int i = 0; i < image.getWidth() - 1; i++) {
                    for (int j = 0; j < image.getHeight() - 1; j++) {
                        Color currentPixel = new Color(image.getRGB(i, j));
                        Color rightPixel = new Color(image.getRGB(i + 1, j));
                        Color downPixel = new Color(image.getRGB(i, j + 1));
                        if (farColors(currentPixel, rightPixel) || farColors(currentPixel, downPixel)){
                           image.setRGB(i, j, Color.BLACK.getRGB());
                        } else {
                            image.setRGB(i, j, Color.WHITE.getRGB());
                        }

                    }
                    File output = new File("src/main/java/Year1.Semester2/ProgrammingWorkshop/Lesson4/ImageManipulation/desLines/newCake.jpg");
                    ImageIO.write(image, "jpg", output);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean farColors(Color color1, Color color2){
        int redDiff = color1.getRed() - color2.getRed();
        redDiff = Math.abs(redDiff);
        int greenDiff = color1.getGreen() - color2.getGreen();
        greenDiff = Math.abs(redDiff);
        int blueDiff = color1.getBlue() - color2.getBlue();
        blueDiff = Math.abs(redDiff);
        if ((redDiff + greenDiff + blueDiff) / 3 > 5){
            return  true;
        }
        return false;
    }
}
