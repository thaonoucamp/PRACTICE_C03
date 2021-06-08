package structural.adapter;

public class VietAdapter implements VietSub {
    Japan adapter;

    public VietAdapter(Japan adapter) {
        this.adapter = adapter;
    }

    @Override
    public void send(String words) {
        System.out.println(words);
        String translator = this.translate(words);
        adapter.receive(translator);
    }

    public String translate(String box) {
        System.out.println("The box is translator");
        return box;
    }

}
