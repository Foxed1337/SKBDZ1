import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var om = new ObjectMapper();
        var person = new Person("Ilya", "Zenkov", 20);
        om.writeValue(new File("personal_data.json"), person);

    }
}
