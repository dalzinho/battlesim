package output;

public class ErrorOutput implements Output {
    public void write(String message) {
        System.err.println(message);
    }
}
