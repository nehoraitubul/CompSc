package Semester2.OOP1.Lesson6.FileExeTitanic;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try{
            File file = new File("C:\\CompSc\\CompSc\\src\\main\\java\\Semester2\\OOP1\\Lesson6\\FileExeTitanic\\titanic.csv");
            if (!file.exists()){
                System.out.println("File Not Found!");
            }
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] row = line.split(",");
            for(String s : row){
                System.out.print(s + ", ");
            }
            List<Passenger> passengersList = new ArrayList<>();
            while (scanner.hasNextLine()){
                String currLine = scanner.nextLine();
                int firstQuoteIndex = currLine.indexOf("\"");
                int secondQuoteIndex = currLine.indexOf("\"", firstQuoteIndex + 1);

                String[] currLineArr = currLine.split(",", -1);
                System.out.println("numm" + currLineArr.length);
                System.out.println(currLine);
                Passenger passenger = new Passenger(
                        Integer.getInteger(currLineArr[1]),
                        Integer.getInteger(currLineArr[0]),
                        Integer.getInteger(currLineArr[2]),
                        currLineArr[3] + currLineArr[4],
                        currLineArr[5],
                        Integer.getInteger(currLineArr[6]),
                        Integer.getInteger(currLineArr[7]),
                        Integer.getInteger(currLineArr[8]),
                        currLineArr[9],
                        Double.parseDouble(currLineArr[10]),
                        currLineArr[11],
                        currLineArr[12]
                        );
                passengersList.add(passenger);
            }

            System.out.println(passengersList.get(1).getFormattedName());

            System.out.println("תן שם:");
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            List<String> names = new ArrayList<>();
            for (Passenger p : passengersList){
                String foundName = p.searchAsName(name);
                if (foundName != null){
                    names.add(name);
                }
            }
            for (String n : names){
                System.out.print(n + ", ");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }

}
