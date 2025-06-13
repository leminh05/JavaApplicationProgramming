package Lab4.src;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Task2 {
    public static void main(String[] args){
        // 1. Create an ArrayList of string obects named moviesTitles with your favorite movie titles.
        List<String> movieTitles = new ArrayList<>();
        movieTitles.add("The Shawshank Redemption"); 
        movieTitles.add("The Godfather"); 
        movieTitles.add("The Dark Knight"); 
        movieTitles.add("Pulp Fiction"); 
        movieTitles.add("Forrest Gump"); 

        // using the traditional for loop and print the entire list.
        System.out.println("---Using traditional for loop---");
        for(int i = 0; i < movieTitles.size(); i ++){
            System.out.println("Movie " + (i + 1) + ": " + movieTitles.get(i));
        }

        // using the for-each loop and print the entire list.
        System.out.println("---Using for-each loop---");
        for(String movie: movieTitles){
            System.out.println("Movie: " + movie);
        }

        // using the Iterator and print the entire list.
        System.out.println("---Using Iterator---");
        Iterator<String> iterator = movieTitles.iterator();
        while(iterator.hasNext()){
            String movie = iterator.next();
            System.out.println("Movie: " + movie);
        }
    }
}
