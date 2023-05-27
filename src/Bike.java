abstract public class Bike {
    abstract void ride();
}
class YamahaFz extends Bike{
    @java.lang.Override
    void ride() {
        System.out.println("Ride Safely!");
    }
    public static void main(String[] args) {
        Bike b = new YamahaFz();
        b.ride();
    }
}
