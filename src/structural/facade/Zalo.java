package structural.facade;

public class Zalo implements SocialShare {
    private String message;

    @Override
    public void share() {
        System.out.println("Zalo : " + this.message);
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }
}
