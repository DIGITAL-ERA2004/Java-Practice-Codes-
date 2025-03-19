import java.nio.file.*;

public class copy {
    public static void main(String[] args) {
        try {
            // Copy the contents of source.txt to destination.txt
            Files.copy(Path.of("source.txt"), Path.of("destination.txt"), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
