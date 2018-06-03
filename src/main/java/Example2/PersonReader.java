package Example2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonReader {
    public void reading() {
        List<String> textList = new ArrayList<String>();
        String text = "Krzysztof Kaczynski 25 93030155555 99";
        String readingText;
        FileReader file;

        try {
            file = new FileReader("C:\\\\Projekty_java\\tddExample2\\text.csv");
            BufferedReader reader = new BufferedReader(file);
            readingText = reader.readLine();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}