package CW.Prim_3;

public abstract class Actor implements ActorBehaviour {

    protected String name;
    protected boolean makeOrder;
    protected boolean takeOrder;



    public boolean isMakeOrder() {
        return makeOrder;
    }

    public boolean isTakeOrder() {
        return takeOrder;
    }

    public abstract String getName();

    public void setName(String name) {
        this.name = name;
    }
}
