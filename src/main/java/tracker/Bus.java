package tracker;

public class Bus implements Transport {


    @Override
    public String go() {
        return null;
    }

    @Override
    public int numbersPassanger(int number) {
        return 5;
    }

    @Override
    public int fuelGassoline(int price) {
        return 3;
    }

}
