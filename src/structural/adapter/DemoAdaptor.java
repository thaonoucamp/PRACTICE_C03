package structural.adapter;

public class DemoAdaptor {
    public static void main(String[] args) {
        VietSub adaptor = new VietAdapter(new Japan());
        adaptor.send("Xin chao Japan");
    }
}
