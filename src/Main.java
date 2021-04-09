import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	    List<String> stringList = List.of("Avatar, Captain Philips,The Avengers");

	    List<String> sortedList = sortList(stringList);

        List<String> toLowercase = toLowerCase(sortedList);
    }

    private static List<String> sortList(List<String> movieList) {
        return movieList.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    private static List<String> toLowerCase(List<String> movieList) {
        return movieList.stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());
    }

    private static List<String> toUppercase(List<String> movieList){
        return movieList.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
    }
}

