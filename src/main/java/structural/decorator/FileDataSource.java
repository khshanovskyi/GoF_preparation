package structural.decorator;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@AllArgsConstructor
@ToString
public class FileDataSource implements DataSource{
    private String fileName;

    @Override
    public void writeData(String data) {
        Path path = Paths.get(fileName);
        try {
            Files.write(path, data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readData() {
        Path path = Paths.get(fileName);
        String result = null;
        try {
            result = Files.readAllLines(path).get(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
