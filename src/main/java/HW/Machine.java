package HW;

public abstract class Machine implements MachineInterface {

    protected String name;
    protected boolean on;
    protected boolean off;


    public boolean isOn() {
        return on;
    }

    public boolean isOff() {
        return off;
    }

    public abstract String getName();

    public void setName(String name) {
        this.name = name;
    }
}
