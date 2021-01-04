package automobile.fourwheeler;

public class Logan extends automobile.Vehicle {
    public int speed() {
        return 90;
    }

    public int gps() {
        return 103;
    }

    @Override
    public String getModelName() {
        return "Logan";
    }

    @Override
    public String getRegistrationNumber() {
        return "Logan 4321";
    }

    @Override
    public String getOwnerName() {
        return "Wolverine";
    }
}
