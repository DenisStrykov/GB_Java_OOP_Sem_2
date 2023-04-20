package CW.Prim_1;

public interface DefaultInterface {

    void printBankAccount();
    default void getUserName() {
        System.out.println("Дефолт");
    }

}
