package structural.facade;

public class FacadeShare  {
    private Facebook facebook;
    private Twiter twiter;
    private Zalo zalo;

    public void share(String message) {
        facebook.setMessage(message);
        zalo.setMessage(message);
        twiter.setMessage(message);
        facebook.share();
        twiter.share();
        zalo.share();
    }

    public FacadeShare(Facebook facebook, Twiter twiter, Zalo zalo) {
        this.facebook = facebook;
        this.twiter = twiter;
        this.zalo = zalo;
    }

}
