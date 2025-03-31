package Semester1.ExamPrep2.MovieExe;

public class Library {
    private String name;
    private Movie[] movies;

    public Library(String name){
        this.name = name;
        this.movies = new Movie[0];
    }

    public boolean addMovie(Movie movie){
        for (int i = 0; i < this.movies.length; i++) {
            if (this.movies[i].getName().equals(movie.getName())){
                return false;
            }
        }
        Movie[] temp = new Movie[this.movies.length + 1];
        for (int i = 0; i < this.movies.length; i++) {
            temp[i] = this.movies[i];
        }
        temp[temp.length - 1] = movie;
        this.movies = temp;
        return true;
    }

    public int longestMovie(){
        if (this.movies.length == 0){
            return 0;
        }
        int longest = this.movies[0].getDuration();
        for (int i = 0; i < this.movies.length; i++) {
            if (this.movies[i].getDuration() > longest){
                longest = this.movies[i].getDuration();
            }
        }
        return longest;
    }
}


