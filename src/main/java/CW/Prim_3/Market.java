package CW.Prim_3;


import java.util.*;

public class Market implements QueueBehaviour, MarketBehaviour {

    List<Human> actorList = new ArrayList<>();
    Queue<Human> actorQueue = new LinkedList<>();


    @Override
    public void acceptToMarket(Human human) {
        actorList.add(human);
        System.out.println(human.getName() + " вошел в магазин");
    }

    @Override
    public void releaseFromMarket(Human human) {
        actorList.remove(human);
        System.out.println(human.getName() + " вышел из магазина");
    }

    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Human human) {
        actorQueue.add(human);
        System.out.println(human.getName() + " занял очередь");
    }

    @Override
    public void takeOrders() {
        actorQueue.peek().setTakeOrder();
    }

    @Override
    public void giveOrders() {
        actorQueue.peek().isMakeOrder();
    }

    @Override
    public void releaseFromQueue() {
        actorQueue.poll();

    }
}