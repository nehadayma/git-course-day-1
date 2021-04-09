import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	    List<String> stringList = List.of("Avatar, Captain Philips,The Avengers");

	    List<String> sortedList = sortList(stringList);
    }

    private static List<String> sortList(List<String> movieList) {
        return movieList.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}

