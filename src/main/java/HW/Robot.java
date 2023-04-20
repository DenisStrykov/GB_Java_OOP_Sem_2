package HW;

public class Robot extends Machine {


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setOn() {
        on = true;
    }

    @Override
    public void setOff() {
        off = true;
    }
}
