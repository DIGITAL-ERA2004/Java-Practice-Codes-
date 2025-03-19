import java.io.*;
import java.util.Scanner;

public class lm {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("source.txt"));
        PrintWriter writer = new PrintWriter("destination.txt");

        while (scanner.hasNextLine()) {
            writer.println(scanner.nextLine());
        }

        writer.close();
        System.out.println("File copied!");
    }
}
