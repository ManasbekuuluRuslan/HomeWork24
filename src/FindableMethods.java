import java.util.List;
import java.util.Scanner;
public class FindableMethods implements Findable{
    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {

        return movies;
    }
    @Override
    public void findMovieByName(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a name movies: ");
        String a = scanner.nextLine();
        for (Movie m: movies) {
            if(m.getName().equals(a)){
                System.out.println(m);
            }
        }
    }
    @Override
    public void findMovieByActorName(List<Movie> movies) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Write a name actors: ");
        String a = scanner.nextLine();
        for(Movie m : movies){
            for(Cast c : m.getCast()){
                if (c.getActorFullName().equals(a)){
                    System.out.println(m);
                }
            }
        }
    }
    @Override
    public void findMovieByYear(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a year movies: ");
        int a = scanner.nextInt();
        for (Movie m : movies){
            if (m.getYear() == (a)){
                System.out.println(m);
            }
        }
    }
    @Override
    public void findMovieByDirector(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name directors");
        String a = scanner.nextLine();
        for (Movie m : movies) {
            if (m.getDirector().getName().equals(a)){
                    System.out.println(m.toString());
            }
        }
    }
    @Override
    public void findMovieByDescription(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a movie by description: ");
        String a = scanner.nextLine();
        for (Movie m: movies) {
            if (m.getDescription().equals(a)){
                System.out.println(m);
            }
        }
    }
    @Override
    public void findMovieByRole(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a movie by role: ");
        String a = scanner.nextLine();
        for (Movie m : movies) {
            for (Cast c : m.getCast()) {
                if(c.getRole().equals(a)){
                    System.out.println(a + m.toString());
                }
            }
        }
    }
}