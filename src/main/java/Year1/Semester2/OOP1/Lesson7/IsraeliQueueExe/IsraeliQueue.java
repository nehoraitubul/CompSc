package Year1.Semester2.OOP1.Lesson7.IsraeliQueueExe;

import java.util.ArrayList;
import java.util.List;

public class IsraeliQueue<T>{
    private List<QueueElement<T>> queue;

    public IsraeliQueue(){
        this.queue = new ArrayList<>();
    }

    public String toString(){
        return queue.toString();
    }

    public void insert(QueueElement<T> element){
        for (int i = 0; i < this.queue.size(); i++) {
            for (Object t : element.getFriends()){
                if (this.queue.get(i).getValue().equals(t)) {
                    this.queue.add(i + 1, element);
                    return;
                }
            }
        }
        this.queue.add(element);
    }

    public boolean isEmpty(){
        return this.queue.isEmpty();
    }

    public QueueElement<T> remove(){
        if (!this.queue.isEmpty()){
            return this.queue.removeFirst();
        }
        return null;
    }


    public QueueElement<T> getFirst(){
        if (!this.queue.isEmpty()){
            return this.queue.getFirst();
        }
        return null;
    }

}

