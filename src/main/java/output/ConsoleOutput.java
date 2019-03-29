package output;

public class ConsoleOutput implements Output {

    public void write(String message) {
        System.out.println(message);
    }
}
