package moduleFive.practice;

public class Connection {

    private String ULR;
    private static Connection instance = new Connection("http://google.com/");

    public Connection(String ULR) {
        this.ULR = ULR;
    }

    public static Connection getInstance() {
        return instance;
    }
}
