public class Main {
    public static void main(String[] args) {

        new Thread(new MyServer()::removingSpaces).start();
        new Thread(new Client()::serverExchange).start();
    }
}
