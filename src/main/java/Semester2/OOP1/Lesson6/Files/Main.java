package Semester2.OOP1.Lesson6.Files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\nehor\\OneDrive\\שולחן העבודה\\Try\\try1.txt");
            if (file.exists()){
                System.out.println("EXIST!");
            } else {
                file.createNewFile();
                System.out.println("CREATED FILE!");
            }
//            FileReader fileReader = new FileReader(file);
//            System.out.println((char) fileReader.read());
            Scanner scanner = new Scanner(file);
            System.out.println(scanner.nextLine());
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("cv");

            fileWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
