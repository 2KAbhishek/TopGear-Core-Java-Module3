package automobile.fourwheeler;

public class Ford extends automobile.Vehicle {
    public int speed() {
        return 100;
    }

    public int tempControl() {
        return 22;
    }

    @Override
    public String getModelName() {
        return "Ford";
    }

    @Override
    public String getRegistrationNumber() {
        return "Ford 8765";
    }

    @Override
    public String getOwnerName() {
        return "Harrison Ford";
    }
}
