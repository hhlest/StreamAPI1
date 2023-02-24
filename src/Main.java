
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Go", 5, "White");
        Cat cat2 = new Cat("Tomas", 7, "Black");
        Cat cat3 = new Cat("CatCat", 2, "Red");
        Cat cat4 = new Cat("Fox", 3, "Grey");

        List<Cat> list = List.of(cat1, cat2, cat3, cat4);

        try {
            Optional<Cat> cat = list.stream().max((a,b) -> a.getName().length() - b.getName().length());
            String longestName = cat.get().getName();
            System.out.println(longestName); // CatCat
        } catch (NullPointerException e) {
            System.out.println("null instead of name\n" + e);
        }
    }
}
