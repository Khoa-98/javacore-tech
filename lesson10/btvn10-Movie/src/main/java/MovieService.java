import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MovieService {

    public ArrayList<Movie> getAllMovie(){
        ArrayList<Movie> movies = new ArrayList<>();

        Gson gson = new Gson();
        try {
            FileReader reader = new FileReader("Movie.json");
            Type type = new TypeToken<ArrayList<Movie>>(){}.getType();
            movies = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        }
        return movies;
    }

    public void show(ArrayList<Movie> movies){
        for (Movie m:movies){
            System.out.println(m);
        }
    }
    
    public void sortYear(ArrayList<Movie> movies){
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getYear()-o2.getYear();
            }
        });

    }
    public void sortTitle(ArrayList<Movie> movies){
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getTitle().toLowerCase().compareTo(o2.getTitle().toLowerCase());
            }
        });

    }

    public void searchByTitle(ArrayList<Movie> movies, String searchTitle){
        for (Movie m:movies){
            if(m.getTitle().toLowerCase().contains(searchTitle.toLowerCase())){
                System.out.println(m);
            }
        }
    }

    public void sortView(ArrayList<Movie> movies){
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o2.getView()-o1.getView();
            }
        });

    }
    public void threeMaxView(ArrayList<Movie> movies){
        movies.get(0);
        movies.get(1);
        movies.get(2);
    }

}
