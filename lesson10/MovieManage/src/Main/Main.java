package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import Model.Movie;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1, "Dấu phá thương khung", 45, "kiếm hiệp", 3000000, 2021));
        movies.add(new Movie(1, "Dấu la đại lục", 41, "kiếm hiệp", 2500000, 2020));
        movies.add(new Movie(1, "Thế giới hoàn mĩ", 42, "kiếm hiệp", 30000, 1990));
        movies.add(new Movie(1, "Tinh thần biến", 43, "kiếm hiệp", 260000, 1998));
        movies.add(new Movie(1, "Vũ động càn khôn", 44, "kiếm hiệp", 7800000, 1999));

        System.out.println("Danh sách phim ban đầu: ");
        show(movies);


        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        System.out.println("Danh sách sau khi sắp xếp theo tên: ");
        show(movies);

        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getLength()-o2.getLength();
            }
        });
        System.out.println("Danh sách sau khi sắp xếp theo độ dài: ");
        show(movies);

        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getView()-o2.getView();
            }
        });
        System.out.println("Danh sách sau khi sắp xếp theo lượt xem: ");
        show(movies);

        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getYear()-o2.getYear();
            }
        });
        System.out.println("Danh sách sau khi sắp xếp theo năm xuất bản: ");
        show(movies);
    }

        public static void show(ArrayList<Movie> movies){
        for (Movie m:movies){
            System.out.println(m);
            }
        }

}
