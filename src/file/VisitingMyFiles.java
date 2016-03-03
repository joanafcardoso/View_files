package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Cardoso on 27-Feb-16.
 */
public class VisitingMyFiles {
    public static void main (String[]args) {
        //to see which file are present in the download folder
        Path path = Paths.get("/Users", "Cardoso", "Downloads");

        try {
            Files.walkFileTree(path, new MyVisitor());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
