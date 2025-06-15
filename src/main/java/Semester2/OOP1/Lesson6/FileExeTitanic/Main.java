package Semester2.OOP1.Lesson6.FileExeTitanic;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try{
            File file = new File("C:\\Users\\nehor\\IdeaProjects\\CompSc\\src\\main\\java\\Semester2\\OOP1\\Lesson6\\FileExeTitanic\\titanic.csv");
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
//                System.out.println("numm" + currLineArr.length);
//                System.out.println(currLine);
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
            Scanner sc = new Scanner(System.in);

            while (true){
                System.out.println("תבחר מספר 1-2 (אחכ אסדר את זה)");
                int input = sc.nextInt();

                System.out.println("לפי איזה ערך אתה רוצה לחפש?");
                String searchInput = sc.next();
                Types selectedType = intToTypes(input);
//            List<Passenger> passengers = new ArrayList<>();
//            if (selectedType != null){
//                for (Passenger p : passengersList){
//                    Passenger foundPassenger = p.search(selectedType, searchInput);
//                    if (foundPassenger != null){
//                        passengers.add(foundPassenger);
//                    }
//                }
//            }
                List<Passenger> passengers = passengersList.stream()
                        .filter(p -> p.search(selectedType, searchInput))
                        .toList();

                for (Passenger p : passengers){
                    System.out.println(p);
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }

    public static Types intToTypes(int num){
        switch (num) {
            case 1: return Types.PASSENGER_ID;
            case 2: return Types.SURVIVED;
            case 3: return Types.P_CLASS;
            case 4: return Types.NAME;
            case 5: return Types.SEX;
            case 6: return Types.AGE;
            case 7: return Types.SIB_SP;
            case 8: return Types.PARCH;
            case 9: return Types.TICKET;
            case 10: return Types.FARE;
            case 11: return Types.CABIN;
            case 12: return Types.EMBARKED;
            default: return null;
        }
    }

}
