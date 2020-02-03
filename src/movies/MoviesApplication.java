package movies;

import util.Input;
import movies.MoviesArray;

public class MoviesApplication {

    public static void main(String[] args){
     Input input = new Input();
     Movie[] movies = MoviesArray.findAll();
     
         while (true) {
             System.out.println("What would you like to do?");
             System.out.println("\n");
             System.out.println("0 - exit");
             System.out.println("1 - view all movies");
             System.out.println("2 - view movies in the animated category");
             System.out.println("3 - view movies in the drama category");
             System.out.println("4 - view movies in the horror category");
             System.out.println("5 - view movies in the scifi category");
             System.out.println("\n");
             int choice = input.getInt(0, 5, "Enter your choice: ");
             
             switch (choice) {
                 case 0:
                     break;
                 case 1:
                     printMovies(movies);
                     System.out.println("\n");
                     break;
                 case 2:
                     printMovies(movies,"animated");
                     System.out.println("\n");
                     break;
                 case 3:
                     printMovies(movies, "drama");
                     System.out.println("\n");
                     break;
                 case 4:
                    printMovies(movies, "horror");
                    System.out.println("\n");
                     break;
                 case 5:
                     printMovies(movies, "scifi");
                     System.out.println("\n");
                     break;
             }
         }
    }
    public static void printMovies(Movie[] inputMovies, String inputCategory){
        for(Movie movie : inputMovies){
            if(movie.getCategory() == inputCategory){
                System.out.println(movie.getName() + "--" + movie.getCategory());
            }
        }
    }
    public static void printMovies(Movie[] inputMovies){
        for(Movie movie : inputMovies){
            System.out.println(movie.getName() + "--" + movie.getCategory());
        }
    }
}
