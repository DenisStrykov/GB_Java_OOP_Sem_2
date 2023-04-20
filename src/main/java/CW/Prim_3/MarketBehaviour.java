package CW.Prim_3;

import java.util.List;

public interface MarketBehaviour {

    void acceptToMarket(Human human);
    void releaseFromMarket(Human human);
    void update();

}
