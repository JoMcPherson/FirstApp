package org.example;


import java.util.ArrayList;
import java.util.Collections;

public class FavoriteMovies {
    public static void main(String args[]) {
                ArrayList<String> movies = new ArrayList<String>();
                movies.add("The Shawshank Redemption");
                movies.add("The Godfather");
                movies.add("The Dark Knight");
                movies.add("Pulp Fiction");
                movies.add("The Lord of the Rings: The Return of the King");
                movies.add("Forrest Gump");
                movies.add("Inception");
                movies.add("Fight Club");
                movies.add("The Matrix");
                movies.add("Goodfellas");

                // Sort the list of movie titles
                Collections.sort(movies);

                // Print the sorted list of movie titles
                System.out.println("Movies sorted by title:");
                for (String title : movies) {
                    System.out.println(title);
                }
            }
        }



