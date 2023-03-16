import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Cast cast1 = new Cast("Johnny Depp", "Comedian");
            Cast cast2 = new Cast("Leonardo DiCaprio", "public figure");
            Cast cast3 = new Cast("Will Smit", "Pennsylvania");
            Cast cast4 = new Cast("Keanu Charles Reeves", "Matrix");

            Director director1 = new Director("John", "James");

            List<Cast> casts1 = new ArrayList<>(List.of(cast1, cast2, cast3, cast4));

            Movie movie1 = new Movie("Stranger Things", 2002, "Horror", director1, casts1);

            Cast cast5 = new Cast("William Bradley Pitt", "12 years of slavery");
            Cast cast6 = new Cast("Robert John Downey Jr", "Marvel");
            Cast cast7 = new Cast("Nicolas Cage", "Heart breaker");
            Cast cast8 = new Cast("Mark Sinclair", "Dominik Toretto");

            ArrayList<Cast> casts2 = new ArrayList<>(List.of(cast5, cast6, cast7, cast8));
            Director director2 = new Director("Wes", "Ball");

            Movie movie2 = new Movie("The Mather Runner", 2016, "Survival", director2, casts2);

            List<Movie> movies = new ArrayList<>(List.of(movie2, movie1));
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("--------MENU--------" +
                        "\n1. Get all movies" +
                        "\n2. Find movie by name" +
                        "\n3. Find movie by actor name" +
                        "\n4. Find movie by year" +
                        "\n5. Find movie by director" +
                        "\n6. Find movie by description" +
                        "\n7. Find movie by role" +
                        "\n8. Sort by movie name" +
                        "\n9. Sort by movie year");
                System.out.println("Выбирайте здесь по номеру списка: ");
                FindableMethods findableMethods = new FindableMethods();
                SortableMethods sortableMethods = new SortableMethods();

                int a = scanner.nextInt();
                switch (a) {
                    case 1:
                        System.out.println(findableMethods.getAllMovies(movies));
                        break;
                    case 2:
                        findableMethods.findMovieByName(movies);
                        break;
                    case 3:
                        findableMethods.findMovieByActorName(movies);
                        break;
                    case 4:
                        findableMethods.findMovieByYear(movies);
                        break;
                    case 5:
                        findableMethods.findMovieByDirector(movies);
                        break;
                    case 6:
                        findableMethods.findMovieByDescription(movies);
                        break;
                    case 7:
                        findableMethods.findMovieByRole(movies);
                        break;
                    case 8:
                        sortableMethods.sortByMovieName(movies);
                        break;
                    case 9:
                        sortableMethods.sortByYear(movies);
                        break;
                    default:
                        System.out.println("Мындай фильм жок");
                }
            } catch (Exception e) {
                System.out.println("Сандар менен танданыз!!!");
            }
        }
    }
}