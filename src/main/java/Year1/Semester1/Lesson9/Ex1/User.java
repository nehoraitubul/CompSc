package Year1.Semester1.Lesson9.Ex1;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private int imagesCount;
    private int videosCount;
    private User[] following;
    private User[] followers;

    public User(String firstName, String lastName, int age, int imagesCount,
                int videosCount){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.imagesCount = imagesCount;
        this.videosCount = videosCount;
        this.following = new User[0];
        this.followers = new User[0];
    }

    public String toString(){
        String isPopular = "No", isValid = "No";
        if (isPopular()) isPopular = "Yes";
        if (isValid()) isValid = "Yes";
        return "Personal details: " + this.firstName + " " + this.lastName + " (" + this.age + ")" + " is account valid? " + isValid +
                "\nAccount details: Images: " + this.imagesCount + ", Videos: " + this.videosCount + " is account popular? " + isPopular;
    }

    public boolean isPopular(){
        return this.followers.length >= 50;
    }

    public void follow(User other) {
        boolean isExist = false;
        for (int i = 0; i < this.followers.length; i++) {
            if (followers[i] == other) {
                isExist = true;
            }
        }
        if (!isExist) {
            User[] newFollowing = new User[this.following.length + 1];
            for (int i = 0; i < this.following.length; i++) {
                newFollowing[i] = followers[i];
            }
            newFollowing[this.following.length] = other;
            this.following = newFollowing;


            User[] newFollowers = new User[other.followers.length + 1];
            for (int i = 0; i < other.followers.length; i++) {
                newFollowers[i] = followers[i];
            }
            newFollowers[other.followers.length] = this;
            other.followers = newFollowers;
        }
    }

    public boolean isValid(){
        for (int i = 0; i < this.firstName.length(); i++) {
            if (this.firstName.charAt(i) >= '0' && this.firstName.charAt(i) <= '9'){
                return false;
            }
        }
        for (int i = 0; i < this.lastName.length(); i++) {
            if (this.lastName.charAt(i) >= '0' && this.lastName.charAt(i) <= '9'){
                return false;
            }
        }

        return true;
    }

    public boolean isVip(){
        if (isValid() && this.videosCount >= 10 && this.imagesCount >= 10){
            int counter = 0;
            for (int i = 0; i < this.followers.length; i++) {
                if (this.followers[i].isValid()){
                    counter++;
                }
            }
            if (counter >= 10){
                return true;
            }
        }
        return false;
    }

    public int countMutualConnections(){
        int counter = 0;
        for (int i = 0; i < this.following.length; i++) {
            for (int j = 0; j < this.following[i].following.length; j++) {
                if (this.following[i].following[j] == this){
                    counter++;
                }
            }
        }
        return counter;
    }

    public void removeFakeUsers(){
        int counter = 0;
        for (int i = 0; i < this.following.length; i++) {
            User currUser = this.followers[i];
            if (!currUser.isValid()){
                counter++;
            }
            if (currUser.imagesCount == 0){
                counter++;
            }
            if (currUser.videosCount == 0){
                counter++;
            }
            if (currUser.countMutualConnections() == 0){
                counter++;
            }

            if (counter >= 3){
                User[] newFollowing = new User[this.following.length - 1];
                for (int j = 0; j < this.following.length; j++) {
                    if (this.following[i] == currUser){
                        continue;
                    }
                    newFollowing[i] = this.following[i];
                }

                User[] newFollowers = new User[this.followers.length - 1];
                boolean isInFollowers = false;
                for (int j = 0; j < this.following.length; j++) {
                    if (this.followers[j] == currUser){
                        isInFollowers = true;
                        continue;
                    }
                    newFollowers[j] = this.followers[j];
                }
                if (isInFollowers){
                    this.followers = newFollowers;
                }
            }
        }
    }

}
