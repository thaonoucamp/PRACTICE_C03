package structural.facade;

public class Twiter implements SocialShare {
    private String message;

    @Override
    public void share() {
        System.out.println("Twiter : " + this.message);
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }
}
