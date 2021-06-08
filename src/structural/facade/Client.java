package structural.facade;

public class Client {
    public void share(String message) {
        FacadeShare facade = new FacadeShare(new Facebook(), new Twiter(), new Zalo());
        facade.share(message);
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.share("K h o o o ");
    }
}
