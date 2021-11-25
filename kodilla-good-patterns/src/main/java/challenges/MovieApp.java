package challenges;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class MovieApp {
    public static void main (String [] args){
    MovieStore movieStore = new MovieStore();
        System.out.println(movieStore.iterateUsingLambda(MovieStore.getMovies()));
    }
}
