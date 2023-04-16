package oop2;

public class Bicycle extends WheeledTransport {
    protected Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void service() {
        System.out.println("переворачиваем велосипед");
        updateTyre();
    }
}