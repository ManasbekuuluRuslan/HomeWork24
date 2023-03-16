import java.util.Collections;
import java.util.List;
public class SortableMethods implements Sortable{
    @Override
    public void sortByMovieName(List<Movie> movies) {
        Collections.sort(movies,Movie.sortForAtoZ);
        System.out.println(movies);
    }
    @Override
    public void sortByYear(List<Movie> movies) {
        Collections.sort(movies,Movie.ascending);
        System.out.println(movies);
    }
}