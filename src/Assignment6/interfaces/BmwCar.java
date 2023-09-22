package Assignment6.interfaces;

public class BmwCar implements Car{
    @Override
    public String getShow() {
        return "Show the BMW Car";
    }

    @Override
    public int getPrice() {
        return 1000000000;
    }
}
