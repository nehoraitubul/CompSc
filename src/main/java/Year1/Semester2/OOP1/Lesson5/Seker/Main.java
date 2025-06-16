package Year1.Semester2.OOP1.Lesson5.Seker;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> answers = Map.of(1, "Bibi", 2, "Benet", 3, "Lapid", 4, "Ben-Gvir");
        Question question = new Question("מי מבין הבאים מתאים יותר לראשות הממשלה?", answers);


        Set<Person> people = new HashSet<>();
        IntStream.range(0,100).forEach(i -> people.add(new Person()));

        new Thread(() -> {
          startSurvey(question, people);
        }).start();

    }

    public static void startSurvey(Question question, Set<Person> people){

    }

}
