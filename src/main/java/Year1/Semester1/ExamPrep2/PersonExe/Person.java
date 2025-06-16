package Year1.Semester1.ExamPrep2.PersonExe;

public class Person {
    private String name;
    private int age;
    private Person[] children;

    public boolean hasChildren(){
        return this.children.length > 0;
    }

    public boolean isGrandFather(){
        if (hasChildren()){
            for (int i = 0; i < this.children.length; i++) {
                if (this.children[i].hasChildren()){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean addChild(Person child){
        if (this.age - child.age > 18){
            Person[] temp = new Person[this.children.length + 1];
            for (int i = 0; i < this.children.length; i++) {
                temp[i] = this.children[i];
            }
            temp[temp.length - 1] = child;
            this.children = temp;
            return true;
        }
        return false;
    }

    public Person getYoungestChild(){
        if (hasChildren()){
            int youngestAge = this.children[0].age;
            Person youngest = this.children[0];
            for (int i = 0; i < this.children.length; i++) {
                if (this.children[i].age < youngestAge){
                    youngestAge = this.children[i].age;
                    youngest = this.children[i];
                }
            }
            return youngest;
        }
        return null;
    }

    public char mostCommonStartingLetter(){ // Only 3 generations
        char mostCommonChar = this.name.charAt(0);
        int counter = 1;
        if (hasChildren()){
            char currChar = ' ';
            int currCounter = 0;

            for (int i = 0; i < this.children.length; i++) {
                currChar = this.children[i].name.charAt(0);

                for (int k = 0; k < this.children.length; k++) {
                    if (this.children[k].name.charAt(0) == currChar){
                        counter++;
                    }

                    if (this.children[i].hasChildren()){

                        for (int j = 0; j < this.children[i].children.length; j++) {
                            if (this.children[i].children[j].name.charAt(0) == currChar){
                                counter++;
                            }
                        }

                    }
                }
            }
            if (currCounter > counter){
                counter = currCounter;
                mostCommonChar = currChar;
            }
        }
        return mostCommonChar;
    }

    public int compareGrandChildren(Person other){
        int thisCounter = 0;
        int otherCounter = 0;
        if (hasChildren()){
            for (int i = 0; i < this.children.length; i++) {
                if (this.children[i].hasChildren()){
                    thisCounter += this.children[i].children.length;
                }
            }
        }
        if (other.hasChildren()){
            for (int i = 0; i < other.children.length; i++) {
                if (other.children[i].hasChildren()){
                    otherCounter += other.children[i].children.length;
                }
            }
        }
        if (thisCounter > otherCounter){
            return 1;
        }
        if (otherCounter > thisCounter){
            return -1;
        }
        return 0;
    }
}