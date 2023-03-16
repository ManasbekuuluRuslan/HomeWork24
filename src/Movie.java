import java.util.Comparator;
import java.util.List;
public class Movie {
    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Cast> cast;

    public Movie(String name, int year, String description, Director director, List<Cast> cast) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.director = director;
        this.cast = cast;
    }
    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }


    public String getDescription() {
        return description;
    }


    public Director getDirector() {
        return director;
    }

    public List<Cast> getCast() {
        return cast;
    }

    @Override
    public String toString() {
        return " |--------- Movie --------------------------\n" +
                "| Кинонун аты: " + name + "                \n"+
                "| Чыккан жылы: " + year + "               \n"+
                "| Суроттомосу: " + description + "        \n" +
                "| Директору: " + director +"          \n"+
                "-------------------------------------------\n";
    }
    public static Comparator<Movie> sortForAtoZ = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.name.compareTo(o2.name);
        }
    };
    public static Comparator<Movie> sortForZtoA = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.name.compareTo(o1.name);
        }
    };
    public static Comparator<Movie> ascending = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.year-o2.year;
        }
    };
    public static Comparator<Movie> descending = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.year - o1.year;
        }
    };
}