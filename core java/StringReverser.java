import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringReverser {
    private final List<String> strings;

    public StringReverser(List<String> strings) {
        this.strings = strings;
    }

    public void reverse() {
        Collections.reverse(this.strings);
    }

    public List<String> getStrings() {
        return this.strings;
    }
}

class MainFunction2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");

        StringReverser reverser = new StringReverser(strings);
        reverser.reverse();

        System.out.println(reverser.getStrings());
    }
}