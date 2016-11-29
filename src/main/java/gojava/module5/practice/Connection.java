package gojava.module5.practice;

public class Connection {

    private String url;
    private static Connection instance = new Connection("http://google.com/");

    public Connection(String url) {
        this.url = url;
    }

    public static Connection getInstance() {
        return instance;
    }
}
