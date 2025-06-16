package Year1.Semester1.Lesson11.JavaPrepExam.Exe2;

public class Person {
    private String name;
    private int age;
    Person[] childrens;

    public boolean hasChildren(){
        return this.childrens.length > 0;
    }

    public boolean isGrandFather(){
        if (hasChildren()){
            for (int i = 0; i < this.childrens.length; i++) {
                if (this.childrens[i].hasChildren()){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean addChild(Person child){
        if ((this.age - 18) > child.age){
            Person[] temp = new Person[this.childrens.length + 1];
            for (int i = 0; i < this.childrens.length; i++) {
                temp[i] = this.childrens[i];
            }
            temp[temp.length-1] = child;
            this.childrens = temp;
            return true;
        }
        return false;
    }

    public Person getYoungestChild(){
        if (this.hasChildren()){
            Person youngest = this.childrens[0];
            for (int i = 0; i < this.childrens.length; i++) {
                if (this.childrens[i].age < youngest.age){
                    youngest = this.childrens[i];
                }
            }
            return youngest;
        }
        return null;
    }

    public char mostCommonStartingLetter(){
        return 'g';
    }

    public int compareGrandeChildren(Person other){
        int thisGrandSons = 0;
        int otherGrandSons = 0;
        for (int i = 0; i < this.childrens.length; i++) {
            thisGrandSons += this.childrens[i].childrens.length;
        }
        for (int i = 0; i < other.childrens.length; i++) {
            thisGrandSons += other.childrens[i].childrens.length;
        }

        if (thisGrandSons == otherGrandSons){
            return 0;
        }
        if (thisGrandSons > otherGrandSons){
            return 1;
        }
        return -1;
    }
}
