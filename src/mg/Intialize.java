package mg;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Intialize {

    private final String directoryPath = "/Users/maciek/Desktop/phone book/directory.txt";
    private final String findPath = "/Users/maciek/Desktop/phone book/find.txt";


    public void fileToArray() throws IOException {


        List<String> find = Files.readAllLines(Paths.get(findPath));
        List<String> directory = Files.readAllLines(Paths.get(directoryPath));


        simpleSearch(directory, find);

    }

    private void simpleSearch(List<String> directory, List<String> find) {


        int counter = 0;

        long startTime = System.currentTimeMillis();

        for (String findLine : find) {
            for (String directoryLine : directory) {
                if (directoryLine.contains(findLine)) {
                    counter++;
                    break;
                }
            }
        }
            long totalMilliseconds = System.currentTimeMillis() - startTime;

            long minutes = (totalMilliseconds / 1000) / 60;
            long seconds = (totalMilliseconds / 1000) % 60;
            long millis = totalMilliseconds - seconds * 1000;

            System.out.printf("Found %d / %d entries. ", counter, find.size());
            System.out.printf("Time taken: %2d min. %2d sec. %2d ms.", minutes, seconds, millis);



    }
}

