package Year1.Semester2.OOP1.Lesson7.IsraeliQueueExe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QueueElement <T> {
    private T value;
    private Set<T> friends;


    public QueueElement(T value) {
        this.value = value;
        this.friends = new HashSet<>();
    }

    public void addFriend(T friend){
        this.friends.add(friend);
    }

    public String toString(){
        return "Value: " + this.getValue() + ". Friends: " + this.getFriends();
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Set<T> getFriends() {
        return friends;
    }
}
