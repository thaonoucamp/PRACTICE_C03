package structural.adapter;

public class Client {
    FileCalculator fileCalculator;

    public Client(FileCalculator fileCalculator) {
        this.fileCalculator = fileCalculator;
    }

    public void printSize(String path){
        long size = fileCalculator.calculatorSize(path);
        System.out.println("Size = " + size);
    }
}
