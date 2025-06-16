package Year1.Semester1.Lesson8.Ex1;

import java.util.Scanner;

public class ChildMain {
    public static void numberOfChildsBornInAYear(int year, Child[] childs){
        int counter = 0;
        for (int i = 0; i < childs.length; i++) {
            if (childs[i].year == year){
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void mostBornInAMonthByGender(Child[] childs){
        int topCounterBoy = 0;
        int topCounterGirl = 0;

        int mostBornMonthBoy = 0;
        int mostBornMonthGirl = 0;

        for (int i = 1; i <= 12; i++) {
            int counterBoy = 0;
            int counterGirl = 0;
            for (int j = 0; j < childs.length; j++) {
                if (childs[j].month == i){
                    if (childs[j].boy){
                        counterBoy++;
                    } else {
                        counterGirl++;
                    }
                }
            }
            if (counterBoy > topCounterBoy){
                topCounterBoy = counterBoy;
                mostBornMonthBoy = i;
            }

            if (counterGirl > topCounterGirl){
                topCounterGirl = counterGirl;
                mostBornMonthGirl = i;
            }
        }
        System.out.println("The month with the most Boys born is: " + mostBornMonthBoy + " with " + topCounterBoy + " borns.");
        System.out.println("The month with the most Boys born is: " + mostBornMonthGirl + " with " + topCounterGirl + " borns.");
    }

    public static int ageAvg(Child[] childs){
        int girlAvg = 0;
        int boyAvg = 0;

        int girlCounter = 0;
        int boyCounter = 0;

        for (int i = 0; i < childs.length; i++) {
            if (childs[i].boy){
                boyAvg += childs[i].year;
                boyCounter++;
            } else {
                girlAvg += childs[i].year;
                girlCounter++;
            }
        }
        if ((girlAvg/girlCounter) == (boyAvg/boyCounter)){
            return 0;
        }
        if ((girlAvg/girlCounter) > (boyAvg/boyCounter)){
            return -1;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        Child child1 = new Child();
        child1.year = 2001;
        child1.month = 8;
        child1.boy = true;
        child1.name = "Nehorai";

        Child child2 = new Child();
        child2.year = 2001;
        child2.month = 8;
        child2.boy = true;
        child2.name = "Nehora";

        Child child3 = new Child();
        child3.year = 2001;
        child3.month = 8;
        child3.boy = true;
        child3.name = "Nehor";

        Child child4 = new Child();
        child4.year = 2001;
        child4.month = 1;
        child4.boy = false;
        child4.name = "Nehor";

        Child child5 = new Child();
        child5.year = 2001;
        child5.month = 5;
        child5.boy = false;
        child5.name = "Nehor";

        Child child6 = new Child();
        child6.year = 2001;
        child6.month = 5;
        child6.boy = false;
        child6.name = "Nehor";

        Child[] childs = {child1, child2, child3, child4, child5, child6};

        numberOfChildsBornInAYear(year, childs);

        mostBornInAMonthByGender(childs);

        System.out.println(ageAvg(childs));
    }
}
