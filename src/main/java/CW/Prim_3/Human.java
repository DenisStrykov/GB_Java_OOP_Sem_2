package CW.Prim_3;

public class Human extends Actor {

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setMakeOrder() {
        makeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        takeOrder = true;
    }

}
