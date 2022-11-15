import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TransferFiles {
    public static void main(String[] args) {
        try {
            Path source = Paths.get("C:/Users/prnkg/Downloads/java-maven-starter-kit");
            Path destination = Paths.get("C:/Users/prnkg/Downloads/DoReMiSubscription");
            Files.copy(source, destination);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
