package Year1.Semester2.OOP1.Lesson7.IsraeliQueueExe;

public class Main {

    public static void main(String[] args) {
        QueueElement<String> element1 = new QueueElement<>("Shai");
        element1.addFriend("Nehorai");
        element1.addFriend("Shira");


        QueueElement<String> element2 = new QueueElement<>("Roman");
        element2.addFriend("Dalia");
        element2.addFriend("May");
        element2.addFriend("Batya");


        QueueElement<String> element3 = new QueueElement<>("Batya");
        element3.addFriend("Shai");
        element3.addFriend("Lior");


        QueueElement<String> element4 = new QueueElement<>("Nehorai");
        element4.addFriend("Roman");
        element4.addFriend("Shai");
        element4.addFriend("Batya");


        QueueElement<String> element5 = new QueueElement<>("Lior");
        element5.addFriend("Batya");
        element5.addFriend("Roman");
        element5.addFriend("Nehorai");



        IsraeliQueue<String> queue = new IsraeliQueue<>();
        queue.insert(element1);
        queue.insert(element2);
        queue.insert(element3);
        queue.insert(element4);
        queue.insert(element5);

        System.out.println(queue);
    }

}
