package structural.facade;

public class Facebook implements SocialShare {
    private String message;

    @Override
    public void share() {
        System.out.println("Facebook : " + this.message);
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }
}
