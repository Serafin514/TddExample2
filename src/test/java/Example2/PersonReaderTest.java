package Example2;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PersonReaderTest {
    @Test
    public void testReader() {
        List<String> textList = new ArrayList<String>();
        String text = "Krzysztof Kaczynski 25 93030155555 99";
        FileReader file;
        String readingText = null;
        try {
            file = new FileReader("C:\\\\Projekty_java\\tddExample2\\text.csv");
            BufferedReader reader = new BufferedReader(file);
            readingText = reader.readLine();
            textList.add(readingText);
        }catch (IOException e){

        }
        Assertions.assertThat(text.equals(textList));

    }
}