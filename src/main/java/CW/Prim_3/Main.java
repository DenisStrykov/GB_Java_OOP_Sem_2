package CW.Prim_3;

public class Main {

    public static void main(String[] args) {

        Human human = new Human();
        human.setName("Вася");
        Market coffee = new Market();

        coffee.acceptToMarket(human);
        coffee.takeInQueue(human);
        coffee.takeOrders();
        coffee.giveOrders();
        coffee.releaseFromQueue();
        coffee.releaseFromMarket(human);

    }

}
