import java.io.*;


public class txt {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("source.txt"));
        PrintWriter writer = new PrintWriter("destination.txt");

        while (scanner.hasNext()) {
            writer.println(scanner.next());
        }

        writer.close();
        System.out.println("File copied!");
    }
}